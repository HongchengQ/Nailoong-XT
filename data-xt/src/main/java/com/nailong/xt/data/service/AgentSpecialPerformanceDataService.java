package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class AgentSpecialPerformanceDataService {
    private final GameDataMgr gameDataMgr;

    public AgentSpecialPerformanceConfig getAgentSpecialPerformanceData(int id) {
        return gameDataMgr.getAgentSpecialPerformanceConfigMap().get(String.valueOf(id));
    }
    public AgentSpecialPerformanceConfig getAgentSpecialPerformanceData(String id) {
        return gameDataMgr.getAgentSpecialPerformanceConfigMap().get(id);
    }

    public ArrayList<AgentSpecialPerformanceConfig> getAllAgentSpecialPerformanceData() {
        return new ArrayList<>(gameDataMgr.getAgentSpecialPerformanceConfigMap().values());
    }
}
