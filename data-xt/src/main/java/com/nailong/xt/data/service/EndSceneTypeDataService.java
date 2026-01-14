package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EndSceneTypeDataService {
    private final GameDataMgr gameDataMgr;

    public EndSceneTypeConfig getEndSceneTypeData(int id) {
        return gameDataMgr.getEndSceneTypeConfigMap().get(String.valueOf(id));
    }
    public EndSceneTypeConfig getEndSceneTypeData(String id) {
        return gameDataMgr.getEndSceneTypeConfigMap().get(id);
    }
}
