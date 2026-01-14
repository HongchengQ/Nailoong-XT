package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShieldValueDataService {
    private final GameDataMgr gameDataMgr;

    public ShieldValueConfig getShieldValueData(int id) {
        return gameDataMgr.getShieldValueConfigMap().get(String.valueOf(id));
    }
    public ShieldValueConfig getShieldValueData(String id) {
        return gameDataMgr.getShieldValueConfigMap().get(id);
    }
}
