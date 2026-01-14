package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DropObjectDataService {
    private final GameDataMgr gameDataMgr;

    public DropObjectConfig getDropObjectData(int id) {
        return gameDataMgr.getDropObjectConfigMap().get(String.valueOf(id));
    }
    public DropObjectConfig getDropObjectData(String id) {
        return gameDataMgr.getDropObjectConfigMap().get(id);
    }
}
