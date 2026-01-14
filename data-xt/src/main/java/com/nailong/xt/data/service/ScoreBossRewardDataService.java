package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScoreBossRewardDataService {
    private final GameDataMgr gameDataMgr;

    public ScoreBossRewardConfig getScoreBossRewardData(int id) {
        return gameDataMgr.getScoreBossRewardConfigMap().get(String.valueOf(id));
    }
    public ScoreBossRewardConfig getScoreBossRewardData(String id) {
        return gameDataMgr.getScoreBossRewardConfigMap().get(id);
    }
}
