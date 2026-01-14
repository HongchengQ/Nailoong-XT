package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiscPromoteDataService {
    private final GameDataMgr gameDataMgr;

    public DiscPromoteConfig getDiscPromoteData(int id) {
        return gameDataMgr.getDiscPromoteConfigMap().get(String.valueOf(id));
    }
    public DiscPromoteConfig getDiscPromoteData(String id) {
        return gameDataMgr.getDiscPromoteConfigMap().get(id);
    }
}
