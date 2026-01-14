package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TrialGroupDataService {
    private final GameDataMgr gameDataMgr;

    public TrialGroupConfig getTrialGroupData(int id) {
        return gameDataMgr.getTrialGroupConfigMap().get(String.valueOf(id));
    }
    public TrialGroupConfig getTrialGroupData(String id) {
        return gameDataMgr.getTrialGroupConfigMap().get(id);
    }

    public ArrayList<TrialGroupConfig> getAllTrialGroupData() {
        return new ArrayList<>(gameDataMgr.getTrialGroupConfigMap().values());
    }
}
