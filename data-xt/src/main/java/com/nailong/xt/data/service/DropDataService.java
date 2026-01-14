package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DropDataService {
    private final GameDataMgr gameDataMgr;

    public DropConfig getDropData(int id) {
        return gameDataMgr.getDropConfigMap().get(String.valueOf(id));
    }
    public DropConfig getDropData(String id) {
        return gameDataMgr.getDropConfigMap().get(id);
    }
}
