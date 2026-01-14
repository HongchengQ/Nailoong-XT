package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GachaTypeDataService {
    private final GameDataMgr gameDataMgr;

    public GachaTypeConfig getGachaTypeData(int id) {
        return gameDataMgr.getGachaTypeConfigMap().get(String.valueOf(id));
    }
    public GachaTypeConfig getGachaTypeData(String id) {
        return gameDataMgr.getGachaTypeConfigMap().get(id);
    }
}
