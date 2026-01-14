package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class GmOrderDataService {
    private final GameDataMgr gameDataMgr;

    public GmOrderConfig getGmOrderData(int id) {
        return gameDataMgr.getGmOrderConfigMap().get(String.valueOf(id));
    }
    public GmOrderConfig getGmOrderData(String id) {
        return gameDataMgr.getGmOrderConfigMap().get(id);
    }

    public ArrayList<GmOrderConfig> getAllGmOrderData() {
        return new ArrayList<>(gameDataMgr.getGmOrderConfigMap().values());
    }
}
