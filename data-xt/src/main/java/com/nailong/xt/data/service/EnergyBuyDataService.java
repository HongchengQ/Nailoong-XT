package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnergyBuyDataService {
    private final GameDataMgr gameDataMgr;

    public EnergyBuyConfig getEnergyBuyData(int id) {
        return gameDataMgr.getEnergyBuyConfigMap().get(String.valueOf(id));
    }
    public EnergyBuyConfig getEnergyBuyData(String id) {
        return gameDataMgr.getEnergyBuyConfigMap().get(id);
    }
}
