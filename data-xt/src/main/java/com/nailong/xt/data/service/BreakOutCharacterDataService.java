package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BreakOutCharacterDataService {
    private final GameDataMgr gameDataMgr;

    public BreakOutCharacterConfig getBreakOutCharacterData(int id) {
        return gameDataMgr.getBreakOutCharacterConfigMap().get(String.valueOf(id));
    }
    public BreakOutCharacterConfig getBreakOutCharacterData(String id) {
        return gameDataMgr.getBreakOutCharacterConfigMap().get(id);
    }

    public ArrayList<BreakOutCharacterConfig> getAllBreakOutCharacterData() {
        return new ArrayList<>(gameDataMgr.getBreakOutCharacterConfigMap().values());
    }
}
