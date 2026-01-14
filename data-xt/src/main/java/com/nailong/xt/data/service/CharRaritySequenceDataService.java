package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharRaritySequenceDataService {
    private final GameDataMgr gameDataMgr;

    public CharRaritySequenceConfig getCharRaritySequenceData(int id) {
        return gameDataMgr.getCharRaritySequenceConfigMap().get(String.valueOf(id));
    }
    public CharRaritySequenceConfig getCharRaritySequenceData(String id) {
        return gameDataMgr.getCharRaritySequenceConfigMap().get(id);
    }
}
