package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharPotentialDataService {
    private final GameDataMgr gameDataMgr;

    public CharPotentialConfig getCharPotentialData(int id) {
        return gameDataMgr.getCharPotentialConfigMap().get(String.valueOf(id));
    }
    public CharPotentialConfig getCharPotentialData(String id) {
        return gameDataMgr.getCharPotentialConfigMap().get(id);
    }
}
