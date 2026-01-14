package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrialBuildDataService {
    private final GameDataMgr gameDataMgr;

    public TrialBuildConfig getTrialBuildData(int id) {
        return gameDataMgr.getTrialBuildConfigMap().get(String.valueOf(id));
    }
    public TrialBuildConfig getTrialBuildData(String id) {
        return gameDataMgr.getTrialBuildConfigMap().get(id);
    }
}
