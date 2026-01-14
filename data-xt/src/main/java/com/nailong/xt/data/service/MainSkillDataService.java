package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MainSkillDataService {
    private final GameDataMgr gameDataMgr;

    public MainSkillConfig getMainSkillData(int id) {
        return gameDataMgr.getMainSkillConfigMap().get(String.valueOf(id));
    }
    public MainSkillConfig getMainSkillData(String id) {
        return gameDataMgr.getMainSkillConfigMap().get(id);
    }

    public ArrayList<MainSkillConfig> getAllMainSkillData() {
        return new ArrayList<>(gameDataMgr.getMainSkillConfigMap().values());
    }
}
