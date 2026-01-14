package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TravelerDuelChallengeControlDataService {
    private final GameDataMgr gameDataMgr;

    public TravelerDuelChallengeControlConfig getTravelerDuelChallengeControlData(int id) {
        return gameDataMgr.getTravelerDuelChallengeControlConfigMap().get(String.valueOf(id));
    }
    public TravelerDuelChallengeControlConfig getTravelerDuelChallengeControlData(String id) {
        return gameDataMgr.getTravelerDuelChallengeControlConfigMap().get(id);
    }

    public ArrayList<TravelerDuelChallengeControlConfig> getAllTravelerDuelChallengeControlData() {
        return new ArrayList<>(gameDataMgr.getTravelerDuelChallengeControlConfigMap().values());
    }
}
