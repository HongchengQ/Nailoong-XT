package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JointDrillAffixDataService {
    private final GameDataMgr gameDataMgr;

    public JointDrillAffixConfig getJointDrillAffixData(int id) {
        return gameDataMgr.getJointDrillAffixConfigMap().get(String.valueOf(id));
    }
    public JointDrillAffixConfig getJointDrillAffixData(String id) {
        return gameDataMgr.getJointDrillAffixConfigMap().get(id);
    }
}
