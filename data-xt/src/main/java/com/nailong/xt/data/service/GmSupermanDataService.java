package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
