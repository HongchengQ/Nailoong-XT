package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class SubNoteSkillDataService {
    private final GameDataMgr gameDataMgr;

    public SubNoteSkillConfig getSubNoteSkillData(int id) {
        return gameDataMgr.getSubNoteSkillConfigMap().get(String.valueOf(id));
    }
    public SubNoteSkillConfig getSubNoteSkillData(String id) {
        return gameDataMgr.getSubNoteSkillConfigMap().get(id);
    }

    public ArrayList<SubNoteSkillConfig> getAllSubNoteSkillData() {
        return new ArrayList<>(gameDataMgr.getSubNoteSkillConfigMap().values());
    }
}
