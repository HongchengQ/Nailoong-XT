package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AffinityUpRewardDataService {
    private final GameDataMgr gameDataMgr;

    public AffinityUpRewardConfig getAffinityUpRewardData(int id) {
        return gameDataMgr.getAffinityUpRewardConfigMap().get(String.valueOf(id));
    }
    public AffinityUpRewardConfig getAffinityUpRewardData(String id) {
        return gameDataMgr.getAffinityUpRewardConfigMap().get(id);
    }
}
