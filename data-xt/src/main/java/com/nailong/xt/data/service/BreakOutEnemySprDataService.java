package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BreakOutEnemySprDataService {
    private final GameDataMgr gameDataMgr;

    public BreakOutEnemySprConfig getBreakOutEnemySprData(int id) {
        return gameDataMgr.getBreakOutEnemySprConfigMap().get(String.valueOf(id));
    }
    public BreakOutEnemySprConfig getBreakOutEnemySprData(String id) {
        return gameDataMgr.getBreakOutEnemySprConfigMap().get(id);
    }

    public ArrayList<BreakOutEnemySprConfig> getAllBreakOutEnemySprData() {
        return new ArrayList<>(gameDataMgr.getBreakOutEnemySprConfigMap().values());
    }
}
