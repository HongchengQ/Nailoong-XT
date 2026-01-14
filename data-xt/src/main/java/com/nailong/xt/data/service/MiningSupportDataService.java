package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MiningSupportDataService {
    private final GameDataMgr gameDataMgr;

    public MiningSupportConfig getMiningSupportData(int id) {
        return gameDataMgr.getMiningSupportConfigMap().get(String.valueOf(id));
    }
    public MiningSupportConfig getMiningSupportData(String id) {
        return gameDataMgr.getMiningSupportConfigMap().get(id);
    }
}
