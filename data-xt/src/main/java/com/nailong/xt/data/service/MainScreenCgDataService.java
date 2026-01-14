package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainScreenCgDataService {
    private final GameDataMgr gameDataMgr;

    public MainScreenCgConfig getMainScreenCgData(int id) {
        return gameDataMgr.getMainScreenCgConfigMap().get(String.valueOf(id));
    }
    public MainScreenCgConfig getMainScreenCgData(String id) {
        return gameDataMgr.getMainScreenCgConfigMap().get(id);
    }
}
