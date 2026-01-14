package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MonsterValueTempleteModifyDataService {
    private final GameDataMgr gameDataMgr;

    public MonsterValueTempleteModifyConfig getMonsterValueTempleteModifyData(int id) {
        return gameDataMgr.getMonsterValueTempleteModifyConfigMap().get(String.valueOf(id));
    }
    public MonsterValueTempleteModifyConfig getMonsterValueTempleteModifyData(String id) {
        return gameDataMgr.getMonsterValueTempleteModifyConfigMap().get(id);
    }

    public ArrayList<MonsterValueTempleteModifyConfig> getAllMonsterValueTempleteModifyData() {
        return new ArrayList<>(gameDataMgr.getMonsterValueTempleteModifyConfigMap().values());
    }
}
