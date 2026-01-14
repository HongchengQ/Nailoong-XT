package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class OnceAdditionalAttributeDataService {
    private final GameDataMgr gameDataMgr;

    public OnceAdditionalAttributeConfig getOnceAdditionalAttributeData(int id) {
        return gameDataMgr.getOnceAdditionalAttributeConfigMap().get(String.valueOf(id));
    }
    public OnceAdditionalAttributeConfig getOnceAdditionalAttributeData(String id) {
        return gameDataMgr.getOnceAdditionalAttributeConfigMap().get(id);
    }

    public ArrayList<OnceAdditionalAttributeConfig> getAllOnceAdditionalAttributeData() {
        return new ArrayList<>(gameDataMgr.getOnceAdditionalAttributeConfigMap().values());
    }
}
