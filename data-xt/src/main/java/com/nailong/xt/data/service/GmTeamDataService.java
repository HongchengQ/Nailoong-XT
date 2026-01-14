package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class GmTeamDataService {
    private final GameDataMgr gameDataMgr;

    public GmTeamConfig getGmTeamData(int id) {
        return gameDataMgr.getGmTeamConfigMap().get(String.valueOf(id));
    }
    public GmTeamConfig getGmTeamData(String id) {
        return gameDataMgr.getGmTeamConfigMap().get(id);
    }

    public ArrayList<GmTeamConfig> getAllGmTeamData() {
        return new ArrayList<>(gameDataMgr.getGmTeamConfigMap().values());
    }
}
