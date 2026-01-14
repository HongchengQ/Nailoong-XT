package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NpcAffinityPlotDataService {
    private final GameDataMgr gameDataMgr;

    public NpcAffinityPlotConfig getNpcAffinityPlotData(int id) {
        return gameDataMgr.getNpcAffinityPlotConfigMap().get(String.valueOf(id));
    }
    public NpcAffinityPlotConfig getNpcAffinityPlotData(String id) {
        return gameDataMgr.getNpcAffinityPlotConfigMap().get(id);
    }
}
