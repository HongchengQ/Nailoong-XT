package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrialCharacterDataService {
    private final GameDataMgr gameDataMgr;

    public TrialCharacterConfig getTrialCharacterData(int id) {
        return gameDataMgr.getTrialCharacterConfigMap().get(String.valueOf(id));
    }
    public TrialCharacterConfig getTrialCharacterData(String id) {
        return gameDataMgr.getTrialCharacterConfigMap().get(id);
    }
}
