package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class SkillInstanceFloorDataService {
    private final GameDataMgr gameDataMgr;

    public SkillInstanceFloorConfig getSkillInstanceFloorData(int id) {
        return gameDataMgr.getSkillInstanceFloorConfigMap().get(String.valueOf(id));
    }
    public SkillInstanceFloorConfig getSkillInstanceFloorData(String id) {
        return gameDataMgr.getSkillInstanceFloorConfigMap().get(id);
    }

    public ArrayList<SkillInstanceFloorConfig> getAllSkillInstanceFloorData() {
        return new ArrayList<>(gameDataMgr.getSkillInstanceFloorConfigMap().values());
    }
}
