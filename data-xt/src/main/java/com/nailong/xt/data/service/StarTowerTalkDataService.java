package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StarTowerTalkDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerTalkConfig getStarTowerTalkData(int id) {
        return gameDataMgr.getStarTowerTalkConfigMap().get(String.valueOf(id));
    }
    public StarTowerTalkConfig getStarTowerTalkData(String id) {
        return gameDataMgr.getStarTowerTalkConfigMap().get(id);
    }

    public ArrayList<StarTowerTalkConfig> getAllStarTowerTalkData() {
        return new ArrayList<>(gameDataMgr.getStarTowerTalkConfigMap().values());
    }
}
