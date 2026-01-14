package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CharacterSkillUpgradeDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterSkillUpgradeConfig getCharacterSkillUpgradeData(int id) {
        return gameDataMgr.getCharacterSkillUpgradeConfigMap().get(String.valueOf(id));
    }
    public CharacterSkillUpgradeConfig getCharacterSkillUpgradeData(String id) {
        return gameDataMgr.getCharacterSkillUpgradeConfigMap().get(id);
    }

    public ArrayList<CharacterSkillUpgradeConfig> getAllCharacterSkillUpgradeData() {
        return new ArrayList<>(gameDataMgr.getCharacterSkillUpgradeConfigMap().values());
    }
}
