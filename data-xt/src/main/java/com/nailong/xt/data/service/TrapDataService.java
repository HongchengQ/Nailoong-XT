package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrapDataService {
    private final GameDataMgr gameDataMgr;

    public TrapConfig getTrapData(int id) {
        return gameDataMgr.getTrapConfigMap().get(String.valueOf(id));
    }
    public TrapConfig getTrapData(String id) {
        return gameDataMgr.getTrapConfigMap().get(id);
    }
}
