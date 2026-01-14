package com.nailong.xt.game.core.player.service;

import com.nailong.xt.common.utils.Utils;
import com.nailong.xt.data.model.GuideGroupConfig;
import com.nailong.xt.data.service.GuideGroupDataService;
import com.nailong.xt.game.core.player.model.Player;
import com.nailong.xt.game.core.player.model.PlayerBasicComp;
import com.nailong.xt.proto.cmd.PlayerData;
import com.nailong.xt.proto.cmd.Public;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerPackageService {

    private final GuideGroupDataService guideGroupDataService;

    public PlayerData.PlayerInfo getPlayerInfoProto(Player player) {
        var playerInfo = PlayerData.PlayerInfo.newInstance()
                .setServerTs(Utils.getCurrentServerTime())
                .setSigninIndex(1) // 可能是月签到进度
                .setAchievements(new byte[64])
                .setAcc(getPlayerAccInfoProto(player))
                .setWorldClass(getPlayerWorldClassInfoProto(player))
                .setEnergy(getPlayerEnergyInfoProto(player));

        playerInfo.addRes(Public.Res.newInstance().setTid(1).setQty(44482));
        playerInfo.addRes(Public.Res.newInstance().setTid(2).setQty(210));
        playerInfo.addRes(Public.Res.newInstance().setTid(12).setQty(35));
        playerInfo.addRes(Public.Res.newInstance().setTid(36).setQty(3));
        playerInfo.addRes(Public.Res.newInstance().setTid(30003).setQty(2));
        playerInfo.addRes(Public.Res.newInstance().setTid(30001).setQty(8));

        playerInfo.addChars(Public.Char.newInstance()
                .setTid(103)
                .setLevel(1)
                .addAllSkillLvs(1, 1, 1, 1, 1)
                .setSkin(10301)
                // todo AffinityQuests
                .setTalentNodes()
                .addCharGemSlots(Public.CharGemSlot.newInstance().setId(1))
                .addCharGemSlots(Public.CharGemSlot.newInstance().setId(2))
                .addCharGemSlots(Public.CharGemSlot.newInstance().setId(3))
                // todo  .setCharGemPresets
                .setCreateTime(1767206898)
        );

        return playerInfo;
    }

    private Public.AccInfo getPlayerAccInfoProto(Player player) {
        PlayerBasicComp basicComp = player.getPlayerBasicComp();

        var accInfo = Public.AccInfo.newInstance()
                .setId(player.getUid())
                .setNickName(basicComp.getNickname())
                .setHeadIcon(101)
                .setSkinId(10301)
                .setTitlePrefix(1)
                .setTitleSuffix(2)
                .setSignature(basicComp.getSignature())
                .setGender(true)
                .setCreateTime(1767206898);

        List<GuideGroupConfig> allGuideGroupData = guideGroupDataService.getAllGuideGroupData();
        for (GuideGroupConfig data : allGuideGroupData) {
            var info = Public.NewbieInfo.newInstance()
                    .setGroupId(data.getId())
                    .setStepId(-1);
            accInfo.addNewbies(info);
        }

        return accInfo;
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
                .setIsPrimary(true);

        return PlayerData.EnergyInfo.newInstance()
                .setEnergy(energy);
    }


}
