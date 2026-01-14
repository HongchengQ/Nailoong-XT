package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class AttributeLimitDataService {
    private final GameDataMgr gameDataMgr;

    public AttributeLimitConfig getAttributeLimitData(int id) {
        return gameDataMgr.getAttributeLimitConfigMap().get(String.valueOf(id));
    }
    public AttributeLimitConfig getAttributeLimitData(String id) {
        return gameDataMgr.getAttributeLimitConfigMap().get(id);
    }

    public ArrayList<AttributeLimitConfig> getAllAttributeLimitData() {
        return new ArrayList<>(gameDataMgr.getAttributeLimitConfigMap().values());
    }
}
