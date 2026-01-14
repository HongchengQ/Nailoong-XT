package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
