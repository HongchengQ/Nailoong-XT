package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NpcConfigDataService {
    private final GameDataMgr gameDataMgr;

    public NpcConfigConfig getNpcConfigData(int id) {
        return gameDataMgr.getNpcConfigConfigMap().get(String.valueOf(id));
    }
    public NpcConfigConfig getNpcConfigData(String id) {
        return gameDataMgr.getNpcConfigConfigMap().get(id);
    }
}
