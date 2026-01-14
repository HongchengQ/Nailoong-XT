package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CharacterAdvanceDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterAdvanceConfig getCharacterAdvanceData(int id) {
        return gameDataMgr.getCharacterAdvanceConfigMap().get(String.valueOf(id));
    }
    public CharacterAdvanceConfig getCharacterAdvanceData(String id) {
        return gameDataMgr.getCharacterAdvanceConfigMap().get(id);
    }

    public ArrayList<CharacterAdvanceConfig> getAllCharacterAdvanceData() {
        return new ArrayList<>(gameDataMgr.getCharacterAdvanceConfigMap().values());
    }
}
