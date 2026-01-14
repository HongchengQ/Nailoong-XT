package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class AttributeDataService {
    private final GameDataMgr gameDataMgr;

    public AttributeConfig getAttributeData(int id) {
        return gameDataMgr.getAttributeConfigMap().get(String.valueOf(id));
    }
    public AttributeConfig getAttributeData(String id) {
        return gameDataMgr.getAttributeConfigMap().get(id);
    }

    public ArrayList<AttributeConfig> getAllAttributeData() {
        return new ArrayList<>(gameDataMgr.getAttributeConfigMap().values());
    }
}
