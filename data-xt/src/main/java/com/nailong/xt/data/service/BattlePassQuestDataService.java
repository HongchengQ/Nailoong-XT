package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BattlePassQuestDataService {
    private final GameDataMgr gameDataMgr;

    public BattlePassQuestConfig getBattlePassQuestData(int id) {
        return gameDataMgr.getBattlePassQuestConfigMap().get(String.valueOf(id));
    }
    public BattlePassQuestConfig getBattlePassQuestData(String id) {
        return gameDataMgr.getBattlePassQuestConfigMap().get(id);
    }

    public ArrayList<BattlePassQuestConfig> getAllBattlePassQuestData() {
        return new ArrayList<>(gameDataMgr.getBattlePassQuestConfigMap().values());
    }
}
