package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class VampireTalentDataService {
    private final GameDataMgr gameDataMgr;

    public VampireTalentConfig getVampireTalentData(int id) {
        return gameDataMgr.getVampireTalentConfigMap().get(String.valueOf(id));
    }
    public VampireTalentConfig getVampireTalentData(String id) {
        return gameDataMgr.getVampireTalentConfigMap().get(id);
    }

    public ArrayList<VampireTalentConfig> getAllVampireTalentData() {
        return new ArrayList<>(gameDataMgr.getVampireTalentConfigMap().values());
    }
}
