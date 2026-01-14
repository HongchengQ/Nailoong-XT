package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdControlDataService {
    private final GameDataMgr gameDataMgr;

    public AdControlConfig getAdControlData(int id) {
        return gameDataMgr.getAdControlConfigMap().get(String.valueOf(id));
    }
    public AdControlConfig getAdControlData(String id) {
        return gameDataMgr.getAdControlConfigMap().get(id);
    }
}
