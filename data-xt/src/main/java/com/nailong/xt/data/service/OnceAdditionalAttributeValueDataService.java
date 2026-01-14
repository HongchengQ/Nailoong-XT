package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class OnceAdditionalAttributeValueDataService {
    private final GameDataMgr gameDataMgr;

    public OnceAdditionalAttributeValueConfig getOnceAdditionalAttributeValueData(int id) {
        return gameDataMgr.getOnceAdditionalAttributeValueConfigMap().get(String.valueOf(id));
    }
    public OnceAdditionalAttributeValueConfig getOnceAdditionalAttributeValueData(String id) {
        return gameDataMgr.getOnceAdditionalAttributeValueConfigMap().get(id);
    }

    public ArrayList<OnceAdditionalAttributeValueConfig> getAllOnceAdditionalAttributeValueData() {
        return new ArrayList<>(gameDataMgr.getOnceAdditionalAttributeValueConfigMap().values());
    }
}
