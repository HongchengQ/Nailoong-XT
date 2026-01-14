package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GachaDataService {
    private final GameDataMgr gameDataMgr;

    public GachaConfig getGachaData(int id) {
        return gameDataMgr.getGachaConfigMap().get(String.valueOf(id));
    }
    public GachaConfig getGachaData(String id) {
        return gameDataMgr.getGachaConfigMap().get(id);
    }
}
