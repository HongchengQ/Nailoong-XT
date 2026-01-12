package com.nailong.xt.common.provider;

import com.google.protobuf.InvalidProtocolBufferException;
import com.nailong.xt.proto.server.BinPlayerData.PlayerDataBin;
import lombok.extern.slf4j.Slf4j;
import org.babyfish.jimmer.sql.runtime.AbstractScalarProvider;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Component;

import static com.nailong.xt.common.utils.ZLibUtils.compressZlib;
import static com.nailong.xt.common.utils.ZLibUtils.decompressZlib;

@Component
@Slf4j
public class PlayerBinDataScalarProvider extends AbstractScalarProvider<PlayerDataBin, byte[]> {
    @Override
    public PlayerDataBin toScalar(byte @NonNull [] sqlValue) throws InvalidProtocolBufferException {
        byte[] byteBin = decompressZlib(sqlValue);
        return PlayerDataBin.parseFrom(byteBin);
    }

    @Override
    public byte[] toSql(@NonNull PlayerDataBin playerDataBin) {
        long timeStart = System.currentTimeMillis();
        int uid = playerDataBin.getUid();

        // 压缩前
        byte[] byteBin = playerDataBin.toByteArray();
        int beforeLength = byteBin.length;

        // 也是直接无脑压缩好吧
        byteBin = compressZlib(byteBin);
        int afterLength = byteBin.length;

        long timeEnd = System.currentTimeMillis();

        log.info("uid={} PlayerDataBin compress before={} after={}, time_cost={}ms.",
                uid, beforeLength, afterLength, timeEnd - timeStart);

        return byteBin;
    }
}
