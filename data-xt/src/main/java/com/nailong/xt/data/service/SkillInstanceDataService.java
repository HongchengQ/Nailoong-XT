package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class SkillInstanceDataService {
    private final GameDataMgr gameDataMgr;

    public SkillInstanceConfig getSkillInstanceData(int id) {
        return gameDataMgr.getSkillInstanceConfigMap().get(String.valueOf(id));
    }
    public SkillInstanceConfig getSkillInstanceData(String id) {
        return gameDataMgr.getSkillInstanceConfigMap().get(id);
    }

    public ArrayList<SkillInstanceConfig> getAllSkillInstanceData() {
        return new ArrayList<>(gameDataMgr.getSkillInstanceConfigMap().values());
    }
}
