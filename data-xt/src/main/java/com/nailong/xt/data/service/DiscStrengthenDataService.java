package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiscStrengthenDataService {
    private final GameDataMgr gameDataMgr;

    public DiscStrengthenConfig getDiscStrengthenData(int id) {
        return gameDataMgr.getDiscStrengthenConfigMap().get(String.valueOf(id));
    }
    public DiscStrengthenConfig getDiscStrengthenData(String id) {
        return gameDataMgr.getDiscStrengthenConfigMap().get(id);
    }
}
