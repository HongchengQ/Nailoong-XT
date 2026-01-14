package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterUpgradeDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterUpgradeConfig getCharacterUpgradeData(int id) {
        return gameDataMgr.getCharacterUpgradeConfigMap().get(String.valueOf(id));
    }
    public CharacterUpgradeConfig getCharacterUpgradeData(String id) {
        return gameDataMgr.getCharacterUpgradeConfigMap().get(id);
    }
}
