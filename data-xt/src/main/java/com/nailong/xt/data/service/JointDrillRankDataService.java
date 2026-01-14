package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class JointDrillRankDataService {
    private final GameDataMgr gameDataMgr;

    public JointDrillRankConfig getJointDrillRankData(int id) {
        return gameDataMgr.getJointDrillRankConfigMap().get(String.valueOf(id));
    }
    public JointDrillRankConfig getJointDrillRankData(String id) {
        return gameDataMgr.getJointDrillRankConfigMap().get(id);
    }

    public ArrayList<JointDrillRankConfig> getAllJointDrillRankData() {
        return new ArrayList<>(gameDataMgr.getJointDrillRankConfigMap().values());
    }
}
