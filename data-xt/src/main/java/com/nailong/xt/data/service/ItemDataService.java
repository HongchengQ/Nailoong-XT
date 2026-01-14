package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ItemDataService {
    private final GameDataMgr gameDataMgr;

    public ItemConfig getItemData(int id) {
        return gameDataMgr.getItemConfigMap().get(String.valueOf(id));
    }
    public ItemConfig getItemData(String id) {
        return gameDataMgr.getItemConfigMap().get(id);
    }

    public ArrayList<ItemConfig> getAllItemData() {
        return new ArrayList<>(gameDataMgr.getItemConfigMap().values());
    }
}
