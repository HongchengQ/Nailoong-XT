package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterArchiveDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterArchiveConfig getCharacterArchiveData(int id) {
        return gameDataMgr.getCharacterArchiveConfigMap().get(String.valueOf(id));
    }
    public CharacterArchiveConfig getCharacterArchiveData(String id) {
        return gameDataMgr.getCharacterArchiveConfigMap().get(id);
    }
}
