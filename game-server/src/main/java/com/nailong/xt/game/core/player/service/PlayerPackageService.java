package com.nailong.xt.game.core.player.service;

import com.nailong.xt.common.utils.Utils;
import com.nailong.xt.game.core.player.model.Player;
import com.nailong.xt.game.core.player.model.PlayerBasicComp;
import com.nailong.xt.proto.cmd.PlayerData;
import com.nailong.xt.proto.cmd.Public;
import org.springframework.stereotype.Service;

@Service
public class PlayerPackageService {
    public PlayerData.PlayerInfo getPlayerInfoProto(Player player) {
        return PlayerData.PlayerInfo.newInstance()
                .setServerTs(Utils.getCurrentServerTime())
                .setSigninIndex(1) // 可能是月签到进度
                .setAchievements(new byte[64])
                .setAcc(getPlayerAccInfoProto(player))
                .setWorldClass(getPlayerWorldClassInfoProto(player))
                .setEnergy(getPlayerEnergyInfoProto(player))
                ;
    }

    private Public.AccInfo getPlayerAccInfoProto(Player player) {
        PlayerBasicComp basicComp = player.getPlayerBasicComp();

        return Public.AccInfo.newInstance()
                .setId(player.getUid())
                .setNickName(basicComp.getNickname())
                .setHeadIcon(101)
                .setSkinId(10301)
                .setTitlePrefix(1)
                .setTitleSuffix(2)
                .setSignature(basicComp.getSignature())
                .setGender(true)
                .setCreateTime(1767206898)
                ;
    }

    private PlayerData.WorldClassInfo getPlayerWorldClassInfoProto(Player player) {
        return PlayerData.WorldClassInfo.newInstance()
                .setStage(3)
                .setCur(1)
                .setLastExp(2)
                ;
    }

    private PlayerData.EnergyInfo getPlayerEnergyInfoProto(Player player) {
        var energy = Public.Energy.newInstance()
                .setUpdateTime(Utils.getCurrentServerTime())
                .setNextDuration(60)
                .setPrimary(240)
                .setIsPrimary(true)
                ;

        return PlayerData.EnergyInfo.newInstance()
                .setEnergy(energy);
    }


}
