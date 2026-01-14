package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductionDataService {
    private final GameDataMgr gameDataMgr;

    public ProductionConfig getProductionData(int id) {
        return gameDataMgr.getProductionConfigMap().get(String.valueOf(id));
    }
    public ProductionConfig getProductionData(String id) {
        return gameDataMgr.getProductionConfigMap().get(id);
    }
}
