package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class JointDrillQuestDataService {
    private final GameDataMgr gameDataMgr;

    public JointDrillQuestConfig getJointDrillQuestData(int id) {
        return gameDataMgr.getJointDrillQuestConfigMap().get(String.valueOf(id));
    }
    public JointDrillQuestConfig getJointDrillQuestData(String id) {
        return gameDataMgr.getJointDrillQuestConfigMap().get(id);
    }

    public ArrayList<JointDrillQuestConfig> getAllJointDrillQuestData() {
        return new ArrayList<>(gameDataMgr.getJointDrillQuestConfigMap().values());
    }
}
