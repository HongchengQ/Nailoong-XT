package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class SubNoteSkillDropGroupDataService {
    private final GameDataMgr gameDataMgr;

    public SubNoteSkillDropGroupConfig getSubNoteSkillDropGroupData(int id) {
        return gameDataMgr.getSubNoteSkillDropGroupConfigMap().get(String.valueOf(id));
    }
    public SubNoteSkillDropGroupConfig getSubNoteSkillDropGroupData(String id) {
        return gameDataMgr.getSubNoteSkillDropGroupConfigMap().get(id);
    }

    public ArrayList<SubNoteSkillDropGroupConfig> getAllSubNoteSkillDropGroupData() {
        return new ArrayList<>(gameDataMgr.getSubNoteSkillDropGroupConfigMap().values());
    }
}
