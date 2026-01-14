package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DropPkgDataService {
    private final GameDataMgr gameDataMgr;

    public DropPkgConfig getDropPkgData(int id) {
        return gameDataMgr.getDropPkgConfigMap().get(String.valueOf(id));
    }
    public DropPkgConfig getDropPkgData(String id) {
        return gameDataMgr.getDropPkgConfigMap().get(id);
    }
}
