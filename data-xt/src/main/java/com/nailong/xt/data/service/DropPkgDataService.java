package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<DropPkgConfig> getAllDropPkgData() {
        return new ArrayList<>(gameDataMgr.getDropPkgConfigMap().values());
    }
}
