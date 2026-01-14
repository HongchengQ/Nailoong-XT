package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TravelerDuelChallengeDifficultyDataService {
    private final GameDataMgr gameDataMgr;

    public TravelerDuelChallengeDifficultyConfig getTravelerDuelChallengeDifficultyData(int id) {
        return gameDataMgr.getTravelerDuelChallengeDifficultyConfigMap().get(String.valueOf(id));
    }
    public TravelerDuelChallengeDifficultyConfig getTravelerDuelChallengeDifficultyData(String id) {
        return gameDataMgr.getTravelerDuelChallengeDifficultyConfigMap().get(id);
    }
}
