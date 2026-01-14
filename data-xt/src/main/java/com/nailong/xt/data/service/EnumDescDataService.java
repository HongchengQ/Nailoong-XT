package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class EnumDescDataService {
    private final GameDataMgr gameDataMgr;

    public EnumDescConfig getEnumDescData(int id) {
        return gameDataMgr.getEnumDescConfigMap().get(String.valueOf(id));
    }
    public EnumDescConfig getEnumDescData(String id) {
        return gameDataMgr.getEnumDescConfigMap().get(id);
    }

    public ArrayList<EnumDescConfig> getAllEnumDescData() {
        return new ArrayList<>(gameDataMgr.getEnumDescConfigMap().values());
    }
}
