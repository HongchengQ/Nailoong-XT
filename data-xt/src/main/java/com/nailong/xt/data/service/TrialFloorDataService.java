package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TrialFloorDataService {
    private final GameDataMgr gameDataMgr;

    public TrialFloorConfig getTrialFloorData(int id) {
        return gameDataMgr.getTrialFloorConfigMap().get(String.valueOf(id));
    }
    public TrialFloorConfig getTrialFloorData(String id) {
        return gameDataMgr.getTrialFloorConfigMap().get(id);
    }

    public ArrayList<TrialFloorConfig> getAllTrialFloorData() {
        return new ArrayList<>(gameDataMgr.getTrialFloorConfigMap().values());
    }
}
