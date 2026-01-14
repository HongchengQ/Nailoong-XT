package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CharacterDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterConfig getCharacterData(int id) {
        return gameDataMgr.getCharacterConfigMap().get(String.valueOf(id));
    }
    public CharacterConfig getCharacterData(String id) {
        return gameDataMgr.getCharacterConfigMap().get(id);
    }

    public ArrayList<CharacterConfig> getAllCharacterData() {
        return new ArrayList<>(gameDataMgr.getCharacterConfigMap().values());
    }
}
