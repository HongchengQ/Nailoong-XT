package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class VampireRankSeasonDataService {
    private final GameDataMgr gameDataMgr;

    public VampireRankSeasonConfig getVampireRankSeasonData(int id) {
        return gameDataMgr.getVampireRankSeasonConfigMap().get(String.valueOf(id));
    }
    public VampireRankSeasonConfig getVampireRankSeasonData(String id) {
        return gameDataMgr.getVampireRankSeasonConfigMap().get(id);
    }

    public ArrayList<VampireRankSeasonConfig> getAllVampireRankSeasonData() {
        return new ArrayList<>(gameDataMgr.getVampireRankSeasonConfigMap().values());
    }
}
