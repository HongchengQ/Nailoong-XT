package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MonsterActionBranchDataService {
    private final GameDataMgr gameDataMgr;

    public MonsterActionBranchConfig getMonsterActionBranchData(int id) {
        return gameDataMgr.getMonsterActionBranchConfigMap().get(String.valueOf(id));
    }
    public MonsterActionBranchConfig getMonsterActionBranchData(String id) {
        return gameDataMgr.getMonsterActionBranchConfigMap().get(id);
    }

    public ArrayList<MonsterActionBranchConfig> getAllMonsterActionBranchData() {
        return new ArrayList<>(gameDataMgr.getMonsterActionBranchConfigMap().values());
    }
}
