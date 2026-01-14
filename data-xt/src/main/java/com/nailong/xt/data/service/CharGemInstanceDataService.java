package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharGemInstanceDataService {
    private final GameDataMgr gameDataMgr;

    public CharGemInstanceConfig getCharGemInstanceData(int id) {
        return gameDataMgr.getCharGemInstanceConfigMap().get(String.valueOf(id));
    }
    public CharGemInstanceConfig getCharGemInstanceData(String id) {
        return gameDataMgr.getCharGemInstanceConfigMap().get(id);
    }
}
