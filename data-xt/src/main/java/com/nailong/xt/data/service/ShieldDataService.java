package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ShieldDataService {
    private final GameDataMgr gameDataMgr;

    public ShieldConfig getShieldData(int id) {
        return gameDataMgr.getShieldConfigMap().get(String.valueOf(id));
    }
    public ShieldConfig getShieldData(String id) {
        return gameDataMgr.getShieldConfigMap().get(id);
    }

    public ArrayList<ShieldConfig> getAllShieldData() {
        return new ArrayList<>(gameDataMgr.getShieldConfigMap().values());
    }
}
