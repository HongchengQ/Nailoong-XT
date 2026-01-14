package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class AssistQuestDataService {
    private final GameDataMgr gameDataMgr;

    public AssistQuestConfig getAssistQuestData(int id) {
        return gameDataMgr.getAssistQuestConfigMap().get(String.valueOf(id));
    }
    public AssistQuestConfig getAssistQuestData(String id) {
        return gameDataMgr.getAssistQuestConfigMap().get(id);
    }

    public ArrayList<AssistQuestConfig> getAllAssistQuestData() {
        return new ArrayList<>(gameDataMgr.getAssistQuestConfigMap().values());
    }
}
