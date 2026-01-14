package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharGemSlotControlDataService {
    private final GameDataMgr gameDataMgr;

    public CharGemSlotControlConfig getCharGemSlotControlData(int id) {
        return gameDataMgr.getCharGemSlotControlConfigMap().get(String.valueOf(id));
    }
    public CharGemSlotControlConfig getCharGemSlotControlData(String id) {
        return gameDataMgr.getCharGemSlotControlConfigMap().get(id);
    }
}
