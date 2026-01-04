package com.nailong.xt.gate.network;

import com.google.protobuf.ByteString;
import com.nailong.xt.common.aead.AeadHelper;
import com.nailong.xt.common.utils.Utils;
import com.nailong.xt.proto.server.Package.CmdRequestContext;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.springframework.util.ObjectUtils;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

@Getter
@Setter
public class PlayerSession {
    String sessionToken;

    // 是否已经走完 ike_req 交换密钥
    boolean isExchangedInternetKey = false;

    // Crypto
    private int encryptMethod; // 0 = gcm, 1 = chacha20
    private byte[] clientPublicKey;
    private byte[] serverPublicKey;
    private byte[] serverPrivateKey;
    private byte[] key;

    public void generateServerKey() {
        var pair = AeadHelper.generateECDHKEyPair();

        this.serverPrivateKey = ((ECPrivateKeyParameters) pair.getPrivate()).getD().toByteArray();
        this.serverPublicKey = ((ECPublicKeyParameters) pair.getPublic()).getQ().getEncoded(false);
    }

    public void calculateKey() {
        this.key = AeadHelper.generateKey(clientPublicKey, serverPublicKey, serverPrivateKey);
        this.encryptMethod = Utils.randomRange(0, 1);
    }

    public String generateToken() {
        String temp = System.currentTimeMillis() + ":" + Arrays.toString(AeadHelper.generateBytes(64));

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
    public CmdRequestContext decryptMsg(String contextToken, byte[] bytes) throws Exception {
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
        message = AeadHelper.decrypt(message, key, encryptMethod);

        // Get message id
        int offset = 10;
        int cmdId = (message[offset++] << 8) | (message[offset++] & 0xff);

        // Set data
        byte[] data = new byte[message.length - offset];
        System.arraycopy(message, offset, data, 0, data.length);

        return CmdRequestContext.newBuilder()
                .setCmdId(cmdId)
                .setProtoData(ByteString.copyFrom(data))
                .setTimestamp(System.currentTimeMillis())
                .setToken(contextToken)
                .build();
    }

    /**
     * 解包第一个客户端消息
     *
     * @param bytes
     * @return
     * @throws Exception
     */
    private CmdRequestContext decryptFirstMsg(byte[] bytes) throws Exception {
        // 中间变量
        int offset = 0;
        byte[] message = bytes;

        // 初始 key
        byte[] sessionKey = AeadHelper.serverGarbleKeyMap.get("global");

        // Decrypt message
        message = AeadHelper.decryptBasic(message, sessionKey);
        message = AeadHelper.decryptGCM(message, sessionKey);

        // cmdId
        int cmdId = (message[offset++] << 8) | (message[offset++] & 0xff);
        // data
        byte[] data = new byte[message.length - offset];
        System.arraycopy(message, offset, data, 0, data.length);

        return CmdRequestContext.newBuilder()
                .setCmdId(cmdId)
                .setProtoData(ByteString.copyFrom(data))
                .setTimestamp(System.currentTimeMillis())
                .build();
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
        return AeadHelper.encrypt(data, this.key, this.encryptMethod);
    }

    /**
     * 返回给客户端加密包数据
     *
     * @param data 来自远程调用或自身处理的简单包
     */
    private byte[] encryptFirstPacketData(byte[] data) throws Exception {
        byte[] result = data;

        byte[] firstKey = AeadHelper.serverGarbleKeyMap.get("global");

        result = AeadHelper.encryptGCM(result, firstKey);
        result = AeadHelper.encryptBasic(result, firstKey);

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
    @SneakyThrows
    public byte[] encodeMsg(int msgId, ProtoMessage<?> proto) {
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
