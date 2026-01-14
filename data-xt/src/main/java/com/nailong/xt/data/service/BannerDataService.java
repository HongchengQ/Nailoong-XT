package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BannerDataService {
    private final GameDataMgr gameDataMgr;

    public BannerConfig getBannerData(int id) {
        return gameDataMgr.getBannerConfigMap().get(String.valueOf(id));
    }
    public BannerConfig getBannerData(String id) {
        return gameDataMgr.getBannerConfigMap().get(id);
    }
}
