package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class HandbookDataService {
    private final GameDataMgr gameDataMgr;

    public HandbookConfig getHandbookData(int id) {
        return gameDataMgr.getHandbookConfigMap().get(String.valueOf(id));
    }
    public HandbookConfig getHandbookData(String id) {
        return gameDataMgr.getHandbookConfigMap().get(id);
    }

    public ArrayList<HandbookConfig> getAllHandbookData() {
        return new ArrayList<>(gameDataMgr.getHandbookConfigMap().values());
    }
}
