package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DropItemShowDataService {
    private final GameDataMgr gameDataMgr;

    public DropItemShowConfig getDropItemShowData(int id) {
        return gameDataMgr.getDropItemShowConfigMap().get(String.valueOf(id));
    }
    public DropItemShowConfig getDropItemShowData(String id) {
        return gameDataMgr.getDropItemShowConfigMap().get(id);
    }

    public ArrayList<DropItemShowConfig> getAllDropItemShowData() {
        return new ArrayList<>(gameDataMgr.getDropItemShowConfigMap().values());
    }
}
