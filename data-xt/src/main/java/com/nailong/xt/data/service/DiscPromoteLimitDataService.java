package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiscPromoteLimitDataService {
    private final GameDataMgr gameDataMgr;

    public DiscPromoteLimitConfig getDiscPromoteLimitData(int id) {
        return gameDataMgr.getDiscPromoteLimitConfigMap().get(String.valueOf(id));
    }
    public DiscPromoteLimitConfig getDiscPromoteLimitData(String id) {
        return gameDataMgr.getDiscPromoteLimitConfigMap().get(id);
    }
}
