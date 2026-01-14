package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<DropObjectGroupConfig> getAllDropObjectGroupData() {
        return new ArrayList<>(gameDataMgr.getDropObjectGroupConfigMap().values());
    }
}
