package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class PotentialDataService {
    private final GameDataMgr gameDataMgr;

    public PotentialConfig getPotentialData(int id) {
        return gameDataMgr.getPotentialConfigMap().get(String.valueOf(id));
    }
    public PotentialConfig getPotentialData(String id) {
        return gameDataMgr.getPotentialConfigMap().get(id);
    }

    public ArrayList<PotentialConfig> getAllPotentialData() {
        return new ArrayList<>(gameDataMgr.getPotentialConfigMap().values());
    }
}
