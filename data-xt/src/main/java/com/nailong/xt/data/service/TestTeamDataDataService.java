package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestTeamDataDataService {
    private final GameDataMgr gameDataMgr;

    public TestTeamDataConfig getTestTeamDataData(int id) {
        return gameDataMgr.getTestTeamDataConfigMap().get(String.valueOf(id));
    }
    public TestTeamDataConfig getTestTeamDataData(String id) {
        return gameDataMgr.getTestTeamDataConfigMap().get(id);
    }
}
