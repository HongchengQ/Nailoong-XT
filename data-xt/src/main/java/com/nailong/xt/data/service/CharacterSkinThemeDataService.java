package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterSkinThemeDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterSkinThemeConfig getCharacterSkinThemeData(int id) {
        return gameDataMgr.getCharacterSkinThemeConfigMap().get(String.valueOf(id));
    }
    public CharacterSkinThemeConfig getCharacterSkinThemeData(String id) {
        return gameDataMgr.getCharacterSkinThemeConfigMap().get(id);
    }
}
