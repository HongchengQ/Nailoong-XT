package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MonsterSkinDataService {
    private final GameDataMgr gameDataMgr;

    public MonsterSkinConfig getMonsterSkinData(int id) {
        return gameDataMgr.getMonsterSkinConfigMap().get(String.valueOf(id));
    }
    public MonsterSkinConfig getMonsterSkinData(String id) {
        return gameDataMgr.getMonsterSkinConfigMap().get(id);
    }

    public ArrayList<MonsterSkinConfig> getAllMonsterSkinData() {
        return new ArrayList<>(gameDataMgr.getMonsterSkinConfigMap().values());
    }
}
