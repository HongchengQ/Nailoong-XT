package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ForceDataService {
    private final GameDataMgr gameDataMgr;

    public ForceConfig getForceData(int id) {
        return gameDataMgr.getForceConfigMap().get(String.valueOf(id));
    }
    public ForceConfig getForceData(String id) {
        return gameDataMgr.getForceConfigMap().get(id);
    }

    public ArrayList<ForceConfig> getAllForceData() {
        return new ArrayList<>(gameDataMgr.getForceConfigMap().values());
    }
}
