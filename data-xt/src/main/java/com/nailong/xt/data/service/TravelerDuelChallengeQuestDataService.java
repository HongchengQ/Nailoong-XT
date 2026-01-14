package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TravelerDuelChallengeQuestDataService {
    private final GameDataMgr gameDataMgr;

    public TravelerDuelChallengeQuestConfig getTravelerDuelChallengeQuestData(int id) {
        return gameDataMgr.getTravelerDuelChallengeQuestConfigMap().get(String.valueOf(id));
    }
    public TravelerDuelChallengeQuestConfig getTravelerDuelChallengeQuestData(String id) {
        return gameDataMgr.getTravelerDuelChallengeQuestConfigMap().get(id);
    }
}
