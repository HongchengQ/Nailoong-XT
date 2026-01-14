package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ItemPackMarkDataService {
    private final GameDataMgr gameDataMgr;

    public ItemPackMarkConfig getItemPackMarkData(int id) {
        return gameDataMgr.getItemPackMarkConfigMap().get(String.valueOf(id));
    }
    public ItemPackMarkConfig getItemPackMarkData(String id) {
        return gameDataMgr.getItemPackMarkConfigMap().get(id);
    }

    public ArrayList<ItemPackMarkConfig> getAllItemPackMarkData() {
        return new ArrayList<>(gameDataMgr.getItemPackMarkConfigMap().values());
    }
}
