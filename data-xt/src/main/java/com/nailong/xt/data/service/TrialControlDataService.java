package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TrialControlDataService {
    private final GameDataMgr gameDataMgr;

    public TrialControlConfig getTrialControlData(int id) {
        return gameDataMgr.getTrialControlConfigMap().get(String.valueOf(id));
    }
    public TrialControlConfig getTrialControlData(String id) {
        return gameDataMgr.getTrialControlConfigMap().get(id);
    }

    public ArrayList<TrialControlConfig> getAllTrialControlData() {
        return new ArrayList<>(gameDataMgr.getTrialControlConfigMap().values());
    }
}
