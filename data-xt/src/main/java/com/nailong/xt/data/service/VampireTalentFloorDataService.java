package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class VampireTalentFloorDataService {
    private final GameDataMgr gameDataMgr;

    public VampireTalentFloorConfig getVampireTalentFloorData(int id) {
        return gameDataMgr.getVampireTalentFloorConfigMap().get(String.valueOf(id));
    }
    public VampireTalentFloorConfig getVampireTalentFloorData(String id) {
        return gameDataMgr.getVampireTalentFloorConfigMap().get(id);
    }

    public ArrayList<VampireTalentFloorConfig> getAllVampireTalentFloorData() {
        return new ArrayList<>(gameDataMgr.getVampireTalentFloorConfigMap().values());
    }
}
