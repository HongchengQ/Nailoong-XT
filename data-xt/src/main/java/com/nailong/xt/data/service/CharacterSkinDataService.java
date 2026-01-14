package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterSkinDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterSkinConfig getCharacterSkinData(int id) {
        return gameDataMgr.getCharacterSkinConfigMap().get(String.valueOf(id));
    }
    public CharacterSkinConfig getCharacterSkinData(String id) {
        return gameDataMgr.getCharacterSkinConfigMap().get(id);
    }
}
