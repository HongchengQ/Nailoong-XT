package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GachaPkgDataService {
    private final GameDataMgr gameDataMgr;

    public GachaPkgConfig getGachaPkgData(int id) {
        return gameDataMgr.getGachaPkgConfigMap().get(String.valueOf(id));
    }
    public GachaPkgConfig getGachaPkgData(String id) {
        return gameDataMgr.getGachaPkgConfigMap().get(id);
    }
}
