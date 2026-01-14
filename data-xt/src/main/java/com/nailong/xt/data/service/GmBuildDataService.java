package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GmBuildDataService {
    private final GameDataMgr gameDataMgr;

    public GmBuildConfig getGmBuildData(int id) {
        return gameDataMgr.getGmBuildConfigMap().get(String.valueOf(id));
    }
    public GmBuildConfig getGmBuildData(String id) {
        return gameDataMgr.getGmBuildConfigMap().get(id);
    }
}
