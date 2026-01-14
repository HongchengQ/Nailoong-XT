package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MonsterAttributeContactDataService {
    private final GameDataMgr gameDataMgr;

    public MonsterAttributeContactConfig getMonsterAttributeContactData(int id) {
        return gameDataMgr.getMonsterAttributeContactConfigMap().get(String.valueOf(id));
    }
    public MonsterAttributeContactConfig getMonsterAttributeContactData(String id) {
        return gameDataMgr.getMonsterAttributeContactConfigMap().get(id);
    }

    public ArrayList<MonsterAttributeContactConfig> getAllMonsterAttributeContactData() {
        return new ArrayList<>(gameDataMgr.getMonsterAttributeContactConfigMap().values());
    }
}
