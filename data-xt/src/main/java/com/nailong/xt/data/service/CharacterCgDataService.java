package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterCgDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterCgConfig getCharacterCgData(int id) {
        return gameDataMgr.getCharacterCgConfigMap().get(String.valueOf(id));
    }
    public CharacterCgConfig getCharacterCgData(String id) {
        return gameDataMgr.getCharacterCgConfigMap().get(id);
    }
}
