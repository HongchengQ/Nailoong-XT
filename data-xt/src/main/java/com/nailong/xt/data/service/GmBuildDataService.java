package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<GmBuildConfig> getAllGmBuildData() {
        return new ArrayList<>(gameDataMgr.getGmBuildConfigMap().values());
    }
}
