package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgentDataService {
    private final GameDataMgr gameDataMgr;

    public AgentConfig getAgentData(int id) {
        return gameDataMgr.getAgentConfigMap().get(String.valueOf(id));
    }
    public AgentConfig getAgentData(String id) {
        return gameDataMgr.getAgentConfigMap().get(id);
    }
}
