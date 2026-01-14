package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VampireSurvivorQuestDataService {
    private final GameDataMgr gameDataMgr;

    public VampireSurvivorQuestConfig getVampireSurvivorQuestData(int id) {
        return gameDataMgr.getVampireSurvivorQuestConfigMap().get(String.valueOf(id));
    }
    public VampireSurvivorQuestConfig getVampireSurvivorQuestData(String id) {
        return gameDataMgr.getVampireSurvivorQuestConfigMap().get(id);
    }
}
