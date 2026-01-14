package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class RankDataService {
    private final GameDataMgr gameDataMgr;

    public RankConfig getRankData(int id) {
        return gameDataMgr.getRankConfigMap().get(String.valueOf(id));
    }
    public RankConfig getRankData(String id) {
        return gameDataMgr.getRankConfigMap().get(id);
    }

    public ArrayList<RankConfig> getAllRankData() {
        return new ArrayList<>(gameDataMgr.getRankConfigMap().values());
    }
}
