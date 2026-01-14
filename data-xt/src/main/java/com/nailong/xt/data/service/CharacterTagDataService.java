package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CharacterTagDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterTagConfig getCharacterTagData(int id) {
        return gameDataMgr.getCharacterTagConfigMap().get(String.valueOf(id));
    }
    public CharacterTagConfig getCharacterTagData(String id) {
        return gameDataMgr.getCharacterTagConfigMap().get(id);
    }

    public ArrayList<CharacterTagConfig> getAllCharacterTagData() {
        return new ArrayList<>(gameDataMgr.getCharacterTagConfigMap().values());
    }
}
