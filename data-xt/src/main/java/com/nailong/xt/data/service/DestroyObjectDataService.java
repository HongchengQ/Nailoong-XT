package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DestroyObjectDataService {
    private final GameDataMgr gameDataMgr;

    public DestroyObjectConfig getDestroyObjectData(int id) {
        return gameDataMgr.getDestroyObjectConfigMap().get(String.valueOf(id));
    }
    public DestroyObjectConfig getDestroyObjectData(String id) {
        return gameDataMgr.getDestroyObjectConfigMap().get(id);
    }
}
