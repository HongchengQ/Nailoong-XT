package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class SecondarySkillDataService {
    private final GameDataMgr gameDataMgr;

    public SecondarySkillConfig getSecondarySkillData(int id) {
        return gameDataMgr.getSecondarySkillConfigMap().get(String.valueOf(id));
    }
    public SecondarySkillConfig getSecondarySkillData(String id) {
        return gameDataMgr.getSecondarySkillConfigMap().get(id);
    }

    public ArrayList<SecondarySkillConfig> getAllSecondarySkillData() {
        return new ArrayList<>(gameDataMgr.getSecondarySkillConfigMap().values());
    }
}
