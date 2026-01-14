package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TravelerDuelChallengeAffixDataService {
    private final GameDataMgr gameDataMgr;

    public TravelerDuelChallengeAffixConfig getTravelerDuelChallengeAffixData(int id) {
        return gameDataMgr.getTravelerDuelChallengeAffixConfigMap().get(String.valueOf(id));
    }
    public TravelerDuelChallengeAffixConfig getTravelerDuelChallengeAffixData(String id) {
        return gameDataMgr.getTravelerDuelChallengeAffixConfigMap().get(id);
    }
}
