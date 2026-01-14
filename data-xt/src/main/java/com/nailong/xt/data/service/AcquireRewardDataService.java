package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class AcquireRewardDataService {
    private final GameDataMgr gameDataMgr;

    public AcquireRewardConfig getAcquireRewardData(int id) {
        return gameDataMgr.getAcquireRewardConfigMap().get(String.valueOf(id));
    }
    public AcquireRewardConfig getAcquireRewardData(String id) {
        return gameDataMgr.getAcquireRewardConfigMap().get(id);
    }

    public ArrayList<AcquireRewardConfig> getAllAcquireRewardData() {
        return new ArrayList<>(gameDataMgr.getAcquireRewardConfigMap().values());
    }
}
