package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SkillInstanceTypeDataService {
    private final GameDataMgr gameDataMgr;

    public SkillInstanceTypeConfig getSkillInstanceTypeData(int id) {
        return gameDataMgr.getSkillInstanceTypeConfigMap().get(String.valueOf(id));
    }
    public SkillInstanceTypeConfig getSkillInstanceTypeData(String id) {
        return gameDataMgr.getSkillInstanceTypeConfigMap().get(id);
    }
}
