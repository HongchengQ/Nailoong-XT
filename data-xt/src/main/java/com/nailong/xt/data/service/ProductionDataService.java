package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<ProductionConfig> getAllProductionData() {
        return new ArrayList<>(gameDataMgr.getProductionConfigMap().values());
    }
}
