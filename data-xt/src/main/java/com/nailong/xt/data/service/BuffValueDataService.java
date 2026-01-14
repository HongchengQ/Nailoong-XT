package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
