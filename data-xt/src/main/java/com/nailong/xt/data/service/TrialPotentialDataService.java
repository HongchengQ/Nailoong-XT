package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TrialPotentialDataService {
    private final GameDataMgr gameDataMgr;

    public TrialPotentialConfig getTrialPotentialData(int id) {
        return gameDataMgr.getTrialPotentialConfigMap().get(String.valueOf(id));
    }
    public TrialPotentialConfig getTrialPotentialData(String id) {
        return gameDataMgr.getTrialPotentialConfigMap().get(id);
    }

    public ArrayList<TrialPotentialConfig> getAllTrialPotentialData() {
        return new ArrayList<>(gameDataMgr.getTrialPotentialConfigMap().values());
    }
}
