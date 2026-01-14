package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class VampireSurvivorDataService {
    private final GameDataMgr gameDataMgr;

    public VampireSurvivorConfig getVampireSurvivorData(int id) {
        return gameDataMgr.getVampireSurvivorConfigMap().get(String.valueOf(id));
    }
    public VampireSurvivorConfig getVampireSurvivorData(String id) {
        return gameDataMgr.getVampireSurvivorConfigMap().get(id);
    }

    public ArrayList<VampireSurvivorConfig> getAllVampireSurvivorData() {
        return new ArrayList<>(gameDataMgr.getVampireSurvivorConfigMap().values());
    }
}
