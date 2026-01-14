package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class NpcSkinDataService {
    private final GameDataMgr gameDataMgr;

    public NpcSkinConfig getNpcSkinData(int id) {
        return gameDataMgr.getNpcSkinConfigMap().get(String.valueOf(id));
    }
    public NpcSkinConfig getNpcSkinData(String id) {
        return gameDataMgr.getNpcSkinConfigMap().get(id);
    }

    public ArrayList<NpcSkinConfig> getAllNpcSkinData() {
        return new ArrayList<>(gameDataMgr.getNpcSkinConfigMap().values());
    }
}
