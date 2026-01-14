package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BuffValueDataService {
    private final GameDataMgr gameDataMgr;

    public BuffValueConfig getBuffValueData(int id) {
        return gameDataMgr.getBuffValueConfigMap().get(String.valueOf(id));
    }
    public BuffValueConfig getBuffValueData(String id) {
        return gameDataMgr.getBuffValueConfigMap().get(id);
    }

    public ArrayList<BuffValueConfig> getAllBuffValueData() {
        return new ArrayList<>(gameDataMgr.getBuffValueConfigMap().values());
    }
}
