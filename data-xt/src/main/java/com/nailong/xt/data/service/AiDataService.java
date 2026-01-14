package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AiDataService {
    private final GameDataMgr gameDataMgr;

    public AiConfig getAiData(int id) {
        return gameDataMgr.getAiConfigMap().get(String.valueOf(id));
    }
    public AiConfig getAiData(String id) {
        return gameDataMgr.getAiConfigMap().get(id);
    }
}
