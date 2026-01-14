package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeightParameterDataService {
    private final GameDataMgr gameDataMgr;

    public WeightParameterConfig getWeightParameterData(int id) {
        return gameDataMgr.getWeightParameterConfigMap().get(String.valueOf(id));
    }
    public WeightParameterConfig getWeightParameterData(String id) {
        return gameDataMgr.getWeightParameterConfigMap().get(id);
    }
}
