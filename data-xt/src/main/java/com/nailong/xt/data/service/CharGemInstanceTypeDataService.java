package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharGemInstanceTypeDataService {
    private final GameDataMgr gameDataMgr;

    public CharGemInstanceTypeConfig getCharGemInstanceTypeData(int id) {
        return gameDataMgr.getCharGemInstanceTypeConfigMap().get(String.valueOf(id));
    }
    public CharGemInstanceTypeConfig getCharGemInstanceTypeData(String id) {
        return gameDataMgr.getCharGemInstanceTypeConfigMap().get(id);
    }
}
