package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<ShieldValueConfig> getAllShieldValueData() {
        return new ArrayList<>(gameDataMgr.getShieldValueConfigMap().values());
    }
}
