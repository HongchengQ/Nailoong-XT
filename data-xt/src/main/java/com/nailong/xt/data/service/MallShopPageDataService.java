package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MallShopPageDataService {
    private final GameDataMgr gameDataMgr;

    public MallShopPageConfig getMallShopPageData(int id) {
        return gameDataMgr.getMallShopPageConfigMap().get(String.valueOf(id));
    }
    public MallShopPageConfig getMallShopPageData(String id) {
        return gameDataMgr.getMallShopPageConfigMap().get(id);
    }

    public ArrayList<MallShopPageConfig> getAllMallShopPageData() {
        return new ArrayList<>(gameDataMgr.getMallShopPageConfigMap().values());
    }
}
