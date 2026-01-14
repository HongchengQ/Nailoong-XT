package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BattlePassDataService {
    private final GameDataMgr gameDataMgr;

    public BattlePassConfig getBattlePassData(int id) {
        return gameDataMgr.getBattlePassConfigMap().get(String.valueOf(id));
    }
    public BattlePassConfig getBattlePassData(String id) {
        return gameDataMgr.getBattlePassConfigMap().get(id);
    }

    public ArrayList<BattlePassConfig> getAllBattlePassData() {
        return new ArrayList<>(gameDataMgr.getBattlePassConfigMap().values());
    }
}
