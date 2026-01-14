package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CharGemInstanceFloorDataService {
    private final GameDataMgr gameDataMgr;

    public CharGemInstanceFloorConfig getCharGemInstanceFloorData(int id) {
        return gameDataMgr.getCharGemInstanceFloorConfigMap().get(String.valueOf(id));
    }
    public CharGemInstanceFloorConfig getCharGemInstanceFloorData(String id) {
        return gameDataMgr.getCharGemInstanceFloorConfigMap().get(id);
    }

    public ArrayList<CharGemInstanceFloorConfig> getAllCharGemInstanceFloorData() {
        return new ArrayList<>(gameDataMgr.getCharGemInstanceFloorConfigMap().values());
    }
}
