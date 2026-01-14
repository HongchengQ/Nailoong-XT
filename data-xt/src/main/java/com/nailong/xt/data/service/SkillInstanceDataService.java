package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
