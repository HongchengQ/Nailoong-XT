package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<CharacterArchiveConfig> getAllCharacterArchiveData() {
        return new ArrayList<>(gameDataMgr.getCharacterArchiveConfigMap().values());
    }
}
