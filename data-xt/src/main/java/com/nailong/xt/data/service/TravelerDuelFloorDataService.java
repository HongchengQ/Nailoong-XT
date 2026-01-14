package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TravelerDuelFloorDataService {
    private final GameDataMgr gameDataMgr;

    public TravelerDuelFloorConfig getTravelerDuelFloorData(int id) {
        return gameDataMgr.getTravelerDuelFloorConfigMap().get(String.valueOf(id));
    }
    public TravelerDuelFloorConfig getTravelerDuelFloorData(String id) {
        return gameDataMgr.getTravelerDuelFloorConfigMap().get(id);
    }

    public ArrayList<TravelerDuelFloorConfig> getAllTravelerDuelFloorData() {
        return new ArrayList<>(gameDataMgr.getTravelerDuelFloorConfigMap().values());
    }
}
