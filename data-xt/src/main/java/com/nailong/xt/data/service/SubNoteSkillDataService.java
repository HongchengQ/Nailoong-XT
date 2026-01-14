package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
