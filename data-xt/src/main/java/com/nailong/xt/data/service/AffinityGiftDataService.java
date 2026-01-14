package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AffinityGiftDataService {
    private final GameDataMgr gameDataMgr;

    public AffinityGiftConfig getAffinityGiftData(int id) {
        return gameDataMgr.getAffinityGiftConfigMap().get(String.valueOf(id));
    }
    public AffinityGiftConfig getAffinityGiftData(String id) {
        return gameDataMgr.getAffinityGiftConfigMap().get(id);
    }
}
