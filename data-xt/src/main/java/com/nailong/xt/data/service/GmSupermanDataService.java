package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class GmSupermanDataService {
    private final GameDataMgr gameDataMgr;

    public GmSupermanConfig getGmSupermanData(int id) {
        return gameDataMgr.getGmSupermanConfigMap().get(String.valueOf(id));
    }
    public GmSupermanConfig getGmSupermanData(String id) {
        return gameDataMgr.getGmSupermanConfigMap().get(id);
    }

    public ArrayList<GmSupermanConfig> getAllGmSupermanData() {
        return new ArrayList<>(gameDataMgr.getGmSupermanConfigMap().values());
    }
}
