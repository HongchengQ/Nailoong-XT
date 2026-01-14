package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
