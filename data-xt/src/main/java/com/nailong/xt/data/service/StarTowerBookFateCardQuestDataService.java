package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerBookFateCardQuestDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerBookFateCardQuestConfig getStarTowerBookFateCardQuestData(int id) {
        return gameDataMgr.getStarTowerBookFateCardQuestConfigMap().get(String.valueOf(id));
    }
    public StarTowerBookFateCardQuestConfig getStarTowerBookFateCardQuestData(String id) {
        return gameDataMgr.getStarTowerBookFateCardQuestConfigMap().get(id);
    }
}
