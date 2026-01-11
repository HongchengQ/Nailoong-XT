package com.nailong.xt.game.core.player.model;

import com.nailong.xt.proto.server.BinPlayerData;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * proto 映射类
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class PlayerBasicComp {
    Short level;                     // 等级
    int exp;                       // 经验
    String nickname;                  // 昵称
    int totalGameTime;           // 总共的游戏时间
    int onlineTime;              // 玩家累计在线时间秒，用于埋点日志
    int lastLoginTime;          // 最后登录时间
    int registerTime;            // 账号注册时间即第一次登入时间
    int totalLoginDays;         // 累积登入天数
    int updateLoginDaysTime;   // 上次更新登入天数的时间
    String clientAppVersion;       // 客户端版本
    String clientDeviceInfo;       // 客户端设备信息

    public BinPlayerData.PlayerBasicCompBin toProto() {
        return BinPlayerData.PlayerBasicCompBin.newBuilder()
                .setLevel(this.getLevel())
                .setExp(this.getExp())
                .setNickname(this.getNickname())
                .setTotalGameTime(this.getTotalGameTime())
                .setLastLoginTime(this.getLastLoginTime())
                .setRegisterTime(this.getRegisterTime())
                .setTotalLoginDays(this.getTotalLoginDays())
                .setUpdateLoginDaysTime(this.getUpdateLoginDaysTime())
                .setClientAppVersion(this.getClientAppVersion())
                .setClientDeviceInfo(this.getClientDeviceInfo())
                .build();
    }

    // todo
    @Deprecated
    public void initFromProto(BinPlayerData.PlayerBasicCompBin bin) {
        this.level = (short) bin.getLevel();
    }

    public static PlayerBasicComp fromProto(BinPlayerData.PlayerBasicCompBin playerBasicCompBin) {
        return new PlayerBasicComp()
                .setLevel((short) playerBasicCompBin.getLevel())
                .setExp(playerBasicCompBin.getExp())
                .setNickname(playerBasicCompBin.getNickname())
                .setTotalGameTime(playerBasicCompBin.getTotalGameTime())
                .setLastLoginTime(playerBasicCompBin.getLastLoginTime())
                .setRegisterTime(playerBasicCompBin.getRegisterTime())
                .setTotalLoginDays(playerBasicCompBin.getTotalLoginDays())
                .setUpdateLoginDaysTime(playerBasicCompBin.getUpdateLoginDaysTime())
                .setClientAppVersion(playerBasicCompBin.getClientAppVersion())
                .setClientDeviceInfo(playerBasicCompBin.getClientDeviceInfo())
                ;
    }
}