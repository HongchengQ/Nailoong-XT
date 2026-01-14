package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SkillDataService {
    private final GameDataMgr gameDataMgr;

    public SkillConfig getSkillData(int id) {
        return gameDataMgr.getSkillConfigMap().get(String.valueOf(id));
    }
    public SkillConfig getSkillData(String id) {
        return gameDataMgr.getSkillConfigMap().get(id);
    }
}
