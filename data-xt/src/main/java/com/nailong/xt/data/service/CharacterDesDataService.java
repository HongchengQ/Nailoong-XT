package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CharacterDesDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterDesConfig getCharacterDesData(int id) {
        return gameDataMgr.getCharacterDesConfigMap().get(String.valueOf(id));
    }
    public CharacterDesConfig getCharacterDesData(String id) {
        return gameDataMgr.getCharacterDesConfigMap().get(id);
    }

    public ArrayList<CharacterDesConfig> getAllCharacterDesData() {
        return new ArrayList<>(gameDataMgr.getCharacterDesConfigMap().values());
    }
}
