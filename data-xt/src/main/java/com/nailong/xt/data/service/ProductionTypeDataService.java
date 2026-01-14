package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ProductionTypeDataService {
    private final GameDataMgr gameDataMgr;

    public ProductionTypeConfig getProductionTypeData(int id) {
        return gameDataMgr.getProductionTypeConfigMap().get(String.valueOf(id));
    }
    public ProductionTypeConfig getProductionTypeData(String id) {
        return gameDataMgr.getProductionTypeConfigMap().get(id);
    }

    public ArrayList<ProductionTypeConfig> getAllProductionTypeData() {
        return new ArrayList<>(gameDataMgr.getProductionTypeConfigMap().values());
    }
}
