package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AffinityQuestDataService {
    private final GameDataMgr gameDataMgr;

    public AffinityQuestConfig getAffinityQuestData(int id) {
        return gameDataMgr.getAffinityQuestConfigMap().get(String.valueOf(id));
    }
    public AffinityQuestConfig getAffinityQuestData(String id) {
        return gameDataMgr.getAffinityQuestConfigMap().get(id);
    }
}
