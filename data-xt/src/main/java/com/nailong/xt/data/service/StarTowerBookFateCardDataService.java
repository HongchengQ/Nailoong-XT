package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StarTowerBookFateCardDataService {
    private final GameDataMgr gameDataMgr;

    public StarTowerBookFateCardConfig getStarTowerBookFateCardData(int id) {
        return gameDataMgr.getStarTowerBookFateCardConfigMap().get(String.valueOf(id));
    }
    public StarTowerBookFateCardConfig getStarTowerBookFateCardData(String id) {
        return gameDataMgr.getStarTowerBookFateCardConfigMap().get(id);
    }
}
