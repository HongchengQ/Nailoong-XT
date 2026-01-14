package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResidentGoodsDataService {
    private final GameDataMgr gameDataMgr;

    public ResidentGoodsConfig getResidentGoodsData(int id) {
        return gameDataMgr.getResidentGoodsConfigMap().get(String.valueOf(id));
    }
    public ResidentGoodsConfig getResidentGoodsData(String id) {
        return gameDataMgr.getResidentGoodsConfigMap().get(id);
    }
}
