package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TravelerDuelBossDataService {
    private final GameDataMgr gameDataMgr;

    public TravelerDuelBossConfig getTravelerDuelBossData(int id) {
        return gameDataMgr.getTravelerDuelBossConfigMap().get(String.valueOf(id));
    }
    public TravelerDuelBossConfig getTravelerDuelBossData(String id) {
        return gameDataMgr.getTravelerDuelBossConfigMap().get(id);
    }

    public ArrayList<TravelerDuelBossConfig> getAllTravelerDuelBossData() {
        return new ArrayList<>(gameDataMgr.getTravelerDuelBossConfigMap().values());
    }
}
