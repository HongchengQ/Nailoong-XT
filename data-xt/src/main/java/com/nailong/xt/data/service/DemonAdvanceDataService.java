package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DemonAdvanceDataService {
    private final GameDataMgr gameDataMgr;

    public DemonAdvanceConfig getDemonAdvanceData(int id) {
        return gameDataMgr.getDemonAdvanceConfigMap().get(String.valueOf(id));
    }
    public DemonAdvanceConfig getDemonAdvanceData(String id) {
        return gameDataMgr.getDemonAdvanceConfigMap().get(id);
    }

    public ArrayList<DemonAdvanceConfig> getAllDemonAdvanceData() {
        return new ArrayList<>(gameDataMgr.getDemonAdvanceConfigMap().values());
    }
}
