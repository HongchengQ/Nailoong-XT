package com.nailong.xt.gate.network;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Message;
import com.nailong.xt.common.model.bo.GameServiceKVLoadData;
import com.nailong.xt.common.utils.AeadUtils;
import com.nailong.xt.common.utils.Utils;
import com.nailong.xt.proto.server.Command;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

@Getter
@Setter
@Slf4j
@ToString
public class PlayerSession {

    String sessionToken;
    String accountToken;
    long accountUid;
    int playerUid;

    // 是否已经走完 ike_req 交换密钥
    boolean isExchangedInternetKey = false;

    // Crypto
    private int encryptMethod; // 0 = gcm, 1 = chacha20
    private byte[] clientPublicKey;
    private byte[] serverPublicKey;
    private byte[] serverPrivateKey;
    private byte[] key;

    private PlayerBindInstance playerBindInstance;

    public PlayerSession(ServiceInstance instance) {
        // 随机获取一个 game实例
        this.playerBindInstance = new PlayerBindInstance(instance);
    }

    public void generateServerKey() {
        var pair = AeadUtils.generateECDHKEyPair();

        this.serverPrivateKey = ((ECPrivateKeyParameters) pair.getPrivate()).getD().toByteArray();
        this.serverPublicKey = ((ECPublicKeyParameters) pair.getPublic()).getQ().getEncoded(false);
    }

    public void calculateKey() {
        this.key = AeadUtils.generateKey(clientPublicKey, serverPublicKey, serverPrivateKey);
        this.encryptMethod = Utils.randomRange(0, 1);
    }

    /**
     * 一般情况下不建议使用这个方法
     * 以为它无法与 PlayerSessionMgr 同步
     * 所以建议使用 PlayerSessionMgr 下的方法
     *
     * @return token
     */
    public String generateToken() {
        String temp = System.currentTimeMillis() + ":" + Arrays.toString(AeadUtils.generateBytes(64));

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] bytes = md.digest(temp.getBytes());

            this.sessionToken = Base64.getEncoder().encodeToString(bytes);
        } catch (Exception e) {
            this.sessionToken = Base64.getEncoder().encodeToString(temp.getBytes());
        }

        return this.sessionToken;
    }

    /**
     * 解包客户端消息
     *
     * @param contextToken
     * @param bytes
     * @return
     * @throws Exception
     */
    public Command.CmdReqContext.Builder decryptMsg(String contextToken, byte[] bytes) throws Exception {
        // Sanity for malformed packets
        if (bytes.length <= 12) {
            throw new IllegalArgumentException("Request data too short, need at least 4 bytes for cmdId");
        }

        // token 为空：代表是第一个交换密钥的包
        if (ObjectUtils.isEmpty(contextToken)) {
            return decryptFirstMsg(bytes);
        }

        // 中间变量
        byte[] message = bytes;

        // Decrypt message
        message = AeadUtils.decrypt(message, key, encryptMethod);

        // Get message id
        int offset = 10;
        int cmdId = (message[offset++] << 8) | (message[offset++] & 0xff);

        // Set data
        byte[] data = new byte[message.length - offset];
        System.arraycopy(message, offset, data, 0, data.length);

        return Command.CmdReqContext.newBuilder()
                .setCmdId(cmdId)
                .setProtoData(ByteString.copyFrom(data))
                .setToken(contextToken)
                .setAccountUid(this.accountUid)
                .setPlayerUid(this.playerUid)
                .setTimestamp(System.currentTimeMillis());
    }

    /**
     * 解包第一个客户端消息
     *
     * @param bytes
     * @return
     * @throws Exception
     */
    private Command.CmdReqContext.Builder decryptFirstMsg(byte[] bytes) throws Exception {
        // 中间变量
        int offset = 0;
        byte[] message = bytes;

        // 初始 key
        byte[] sessionKey = AeadUtils.serverGarbleKeyMap.get("global");

        // Decrypt message
        message = AeadUtils.decryptBasic(message, sessionKey);
        message = AeadUtils.decryptGCM(message, sessionKey);

        // cmdId
        int cmdId = (message[offset++] << 8) | (message[offset++] & 0xff);
        // data
        byte[] data = new byte[message.length - offset];
        System.arraycopy(message, offset, data, 0, data.length);

        return Command.CmdReqContext.newBuilder()
                .setCmdId(cmdId)
                .setProtoData(ByteString.copyFrom(data))
                .setTimestamp(System.currentTimeMillis());
    }

    /**
     * 返回给客户端加密包数据
     *
     * @param data 来自远程调用或自身处理的简单包
     */
    public byte[] encryptPacketData(byte[] data) throws Exception {
        // 密钥交换包 - 第一个包
        if (!this.isExchangedInternetKey) {
            return encryptFirstPacketData(data);
        }

        // 非密钥交换包 - 除第一个包以外的包
        return AeadUtils.encrypt(data, this.key, this.encryptMethod);
    }

    /**
     * 返回给客户端加密包数据
     *
     * @param data 来自远程调用或自身处理的简单包
     */
    private byte[] encryptFirstPacketData(byte[] data) throws Exception {
        byte[] result = data;

        byte[] firstKey = AeadUtils.serverGarbleKeyMap.get("global");

        result = AeadUtils.encryptGCM(result, firstKey);
        result = AeadUtils.encryptBasic(result, firstKey);

        this.isExchangedInternetKey = true;

        return result;
    }

    /**
     * 要发送给客户端需要再套一层加密方法 - encryptPacketData
     *
     * @param msgId cmdId
     * @param proto proto
     * @return byte[] - 对 ProtoMessage 进行第一层编码
     */
    public byte[] encodeMsg(int msgId, ProtoMessage<?> proto) throws IOException {
        if (msgId == 0) {
            log.warn("todo: msgId == 0");
        }

        if (proto == null || proto.isEmpty()) {
            return encodeMsg(msgId);
        }

        // Create data array
        byte[] data = new byte[proto.getCachedSize() + 2];

        // Encode msgId
        short id = (short) msgId;
        data[0] = (byte) (id >> 8);
        data[1] = (byte) id;

        // Create proto sink
        var output = ProtoSink.newInstance(data, 2, proto.getCachedSize());

        // Copy packet to data array
        proto.writeTo(output);

        // Complete
        return data;
    }


    /**
     * 编码消息 - 入参为 google proto message 版本
     *
     * @param msgId 消息 ID
     * @param proto proto
     * @return 编码后的字节数组
     */
    public byte[] encodeMsg(int msgId, Message proto) throws IOException {
        if (proto == null) {
            return encodeMsg(msgId);
        }

        // 预计算大小
        int protoSize = proto.getSerializedSize();
        int totalSize = protoSize + 2;

        // 分配数组
        byte[] buffer = new byte[totalSize];

        // 写入消息头
        buffer[0] = (byte) ((msgId >>> 8) & 0xFF);  // 高位字节
        buffer[1] = (byte) (msgId & 0xFF);          // 低位字节

        // 使用 CodedOutputStream 高效写入
        CodedOutputStream cos = CodedOutputStream.newInstance(buffer, 2, protoSize);
        proto.writeTo(cos);
        cos.flush();

        return buffer;
    }

    /**
     * 编码消息 - 入参为ByteString版本
     *
     * @param msgId      消息 ID
     * @param byteString 已经序列化好的 Proto消息ByteString
     * @return 编码后的字节数组
     */
    public byte[] encodeMsg(int msgId, ByteString byteString) {
        if (msgId == 0) {
            log.warn("todo: msgId == 0");
        }

        // 处理空消息（只有消息ID）
        if (byteString == null || byteString.isEmpty()) {
            return encodeMsg(msgId);
        }

        // 获取 ByteString的大小
        int protoSize = byteString.size();

        // 创建数组：消息头(2字节) + 消息体
        byte[] data = new byte[protoSize + 2];

        // 编码消息ID（大端序）
        data[0] = (byte) (msgId >> 8);
        data[1] = (byte) msgId;

        // 将 ByteString复制到数组的偏移位置
        byteString.copyTo(data, 2);

        return data;
    }

    /**
     * 编码 ProtoMessage
     * <p>
     * 要发送给客户端需要再套一层加密方法 - encryptPacketData
     *
     * @param msgId cmdId
     * @return byte[] - 对 ProtoMessage 进行第一层编码
     */
    public byte[] encodeMsg(int msgId) {
        // Create data array
        byte[] data = new byte[2];

        // Encode msgId
        short id = (short) msgId;
        data[0] = (byte) (id >> 8);
        data[1] = (byte) id;

        return data;
    }
}
