package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ResidentShopDataService {
    private final GameDataMgr gameDataMgr;

    public ResidentShopConfig getResidentShopData(int id) {
        return gameDataMgr.getResidentShopConfigMap().get(String.valueOf(id));
    }
    public ResidentShopConfig getResidentShopData(String id) {
        return gameDataMgr.getResidentShopConfigMap().get(id);
    }

    public ArrayList<ResidentShopConfig> getAllResidentShopData() {
        return new ArrayList<>(gameDataMgr.getResidentShopConfigMap().values());
    }
}
