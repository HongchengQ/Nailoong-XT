package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class FactionRelationDataService {
    private final GameDataMgr gameDataMgr;

    public FactionRelationConfig getFactionRelationData(int id) {
        return gameDataMgr.getFactionRelationConfigMap().get(String.valueOf(id));
    }
    public FactionRelationConfig getFactionRelationData(String id) {
        return gameDataMgr.getFactionRelationConfigMap().get(id);
    }

    public ArrayList<FactionRelationConfig> getAllFactionRelationData() {
        return new ArrayList<>(gameDataMgr.getFactionRelationConfigMap().values());
    }
}
