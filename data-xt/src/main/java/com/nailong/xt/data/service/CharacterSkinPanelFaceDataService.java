package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CharacterSkinPanelFaceDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterSkinPanelFaceConfig getCharacterSkinPanelFaceData(int id) {
        return gameDataMgr.getCharacterSkinPanelFaceConfigMap().get(String.valueOf(id));
    }
    public CharacterSkinPanelFaceConfig getCharacterSkinPanelFaceData(String id) {
        return gameDataMgr.getCharacterSkinPanelFaceConfigMap().get(id);
    }

    public ArrayList<CharacterSkinPanelFaceConfig> getAllCharacterSkinPanelFaceData() {
        return new ArrayList<>(gameDataMgr.getCharacterSkinPanelFaceConfigMap().values());
    }
}
