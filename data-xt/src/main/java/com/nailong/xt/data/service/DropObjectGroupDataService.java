package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DropObjectGroupDataService {
    private final GameDataMgr gameDataMgr;

    public DropObjectGroupConfig getDropObjectGroupData(int id) {
        return gameDataMgr.getDropObjectGroupConfigMap().get(String.valueOf(id));
    }
    public DropObjectGroupConfig getDropObjectGroupData(String id) {
        return gameDataMgr.getDropObjectGroupConfigMap().get(id);
    }
}
