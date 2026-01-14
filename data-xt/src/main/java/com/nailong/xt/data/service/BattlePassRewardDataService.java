package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BattlePassRewardDataService {
    private final GameDataMgr gameDataMgr;

    public BattlePassRewardConfig getBattlePassRewardData(int id) {
        return gameDataMgr.getBattlePassRewardConfigMap().get(String.valueOf(id));
    }
    public BattlePassRewardConfig getBattlePassRewardData(String id) {
        return gameDataMgr.getBattlePassRewardConfigMap().get(id);
    }
}
