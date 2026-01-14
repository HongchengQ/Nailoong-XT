package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class PlotDataService {
    private final GameDataMgr gameDataMgr;

    public PlotConfig getPlotData(int id) {
        return gameDataMgr.getPlotConfigMap().get(String.valueOf(id));
    }
    public PlotConfig getPlotData(String id) {
        return gameDataMgr.getPlotConfigMap().get(id);
    }

    public ArrayList<PlotConfig> getAllPlotData() {
        return new ArrayList<>(gameDataMgr.getPlotConfigMap().values());
    }
}
