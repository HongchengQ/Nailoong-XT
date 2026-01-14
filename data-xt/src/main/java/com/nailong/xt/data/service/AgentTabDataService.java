package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class AgentTabDataService {
    private final GameDataMgr gameDataMgr;

    public AgentTabConfig getAgentTabData(int id) {
        return gameDataMgr.getAgentTabConfigMap().get(String.valueOf(id));
    }
    public AgentTabConfig getAgentTabData(String id) {
        return gameDataMgr.getAgentTabConfigMap().get(id);
    }

    public ArrayList<AgentTabConfig> getAllAgentTabData() {
        return new ArrayList<>(gameDataMgr.getAgentTabConfigMap().values());
    }
}
