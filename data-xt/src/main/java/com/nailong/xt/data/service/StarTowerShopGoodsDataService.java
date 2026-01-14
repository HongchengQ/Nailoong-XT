package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerShopGoodsDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerShopGoodsConfig getStarTowerShopGoodsData(int id) {
        return gameDataMgr.getStarTowerShopGoodsConfigMap().get(String.valueOf(id));
    }
    public StarTowerShopGoodsConfig getStarTowerShopGoodsData(String id) {
        return gameDataMgr.getStarTowerShopGoodsConfigMap().get(id);
    }
}
