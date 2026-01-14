package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class JointDrillBattleThresholdDataService {
    private final GameDataMgr gameDataMgr;

    public JointDrillBattleThresholdConfig getJointDrillBattleThresholdData(int id) {
        return gameDataMgr.getJointDrillBattleThresholdConfigMap().get(String.valueOf(id));
    }
    public JointDrillBattleThresholdConfig getJointDrillBattleThresholdData(String id) {
        return gameDataMgr.getJointDrillBattleThresholdConfigMap().get(id);
    }

    public ArrayList<JointDrillBattleThresholdConfig> getAllJointDrillBattleThresholdData() {
        return new ArrayList<>(gameDataMgr.getJointDrillBattleThresholdConfigMap().values());
    }
}
