package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BuffDataService {
    private final GameDataMgr gameDataMgr;

    public BuffConfig getBuffData(int id) {
        return gameDataMgr.getBuffConfigMap().get(String.valueOf(id));
    }
    public BuffConfig getBuffData(String id) {
        return gameDataMgr.getBuffConfigMap().get(id);
    }

    public ArrayList<BuffConfig> getAllBuffData() {
        return new ArrayList<>(gameDataMgr.getBuffConfigMap().values());
    }
}
