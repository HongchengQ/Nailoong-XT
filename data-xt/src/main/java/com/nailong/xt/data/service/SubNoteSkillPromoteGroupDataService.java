package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class SubNoteSkillPromoteGroupDataService {
    private final GameDataMgr gameDataMgr;

    public SubNoteSkillPromoteGroupConfig getSubNoteSkillPromoteGroupData(int id) {
        return gameDataMgr.getSubNoteSkillPromoteGroupConfigMap().get(String.valueOf(id));
    }
    public SubNoteSkillPromoteGroupConfig getSubNoteSkillPromoteGroupData(String id) {
        return gameDataMgr.getSubNoteSkillPromoteGroupConfigMap().get(id);
    }

    public ArrayList<SubNoteSkillPromoteGroupConfig> getAllSubNoteSkillPromoteGroupData() {
        return new ArrayList<>(gameDataMgr.getSubNoteSkillPromoteGroupConfigMap().values());
    }
}
