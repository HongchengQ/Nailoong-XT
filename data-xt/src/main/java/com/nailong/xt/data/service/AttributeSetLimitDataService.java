package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class AttributeSetLimitDataService {
    private final GameDataMgr gameDataMgr;

    public AttributeSetLimitConfig getAttributeSetLimitData(int id) {
        return gameDataMgr.getAttributeSetLimitConfigMap().get(String.valueOf(id));
    }
    public AttributeSetLimitConfig getAttributeSetLimitData(String id) {
        return gameDataMgr.getAttributeSetLimitConfigMap().get(id);
    }

    public ArrayList<AttributeSetLimitConfig> getAllAttributeSetLimitData() {
        return new ArrayList<>(gameDataMgr.getAttributeSetLimitConfigMap().values());
    }
}
