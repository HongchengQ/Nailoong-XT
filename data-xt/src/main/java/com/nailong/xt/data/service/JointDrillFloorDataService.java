package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JointDrillFloorDataService {
    private final GameDataMgr gameDataMgr;

    public JointDrillFloorConfig getJointDrillFloorData(int id) {
        return gameDataMgr.getJointDrillFloorConfigMap().get(String.valueOf(id));
    }
    public JointDrillFloorConfig getJointDrillFloorData(String id) {
        return gameDataMgr.getJointDrillFloorConfigMap().get(id);
    }
}
