package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class JointDrillLevelDataService {
    private final GameDataMgr gameDataMgr;

    public JointDrillLevelConfig getJointDrillLevelData(int id) {
        return gameDataMgr.getJointDrillLevelConfigMap().get(String.valueOf(id));
    }
    public JointDrillLevelConfig getJointDrillLevelData(String id) {
        return gameDataMgr.getJointDrillLevelConfigMap().get(id);
    }

    public ArrayList<JointDrillLevelConfig> getAllJointDrillLevelData() {
        return new ArrayList<>(gameDataMgr.getJointDrillLevelConfigMap().values());
    }
}
