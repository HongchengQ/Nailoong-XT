package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MallShopDataService {
    private final GameDataMgr gameDataMgr;

    public MallShopConfig getMallShopData(int id) {
        return gameDataMgr.getMallShopConfigMap().get(String.valueOf(id));
    }
    public MallShopConfig getMallShopData(String id) {
        return gameDataMgr.getMallShopConfigMap().get(id);
    }
}
