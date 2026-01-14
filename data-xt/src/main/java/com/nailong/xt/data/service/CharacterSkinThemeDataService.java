package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<CharacterSkinThemeConfig> getAllCharacterSkinThemeData() {
        return new ArrayList<>(gameDataMgr.getCharacterSkinThemeConfigMap().values());
    }
}
