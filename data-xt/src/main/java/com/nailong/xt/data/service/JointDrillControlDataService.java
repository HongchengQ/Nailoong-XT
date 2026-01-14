package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class JointDrillControlDataService {
    private final GameDataMgr gameDataMgr;

    public JointDrillControlConfig getJointDrillControlData(int id) {
        return gameDataMgr.getJointDrillControlConfigMap().get(String.valueOf(id));
    }
    public JointDrillControlConfig getJointDrillControlData(String id) {
        return gameDataMgr.getJointDrillControlConfigMap().get(id);
    }

    public ArrayList<JointDrillControlConfig> getAllJointDrillControlData() {
        return new ArrayList<>(gameDataMgr.getJointDrillControlConfigMap().values());
    }
}
