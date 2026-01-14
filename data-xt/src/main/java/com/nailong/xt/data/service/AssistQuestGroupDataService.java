package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AssistQuestGroupDataService {
    private final GameDataMgr gameDataMgr;

    public AssistQuestGroupConfig getAssistQuestGroupData(int id) {
        return gameDataMgr.getAssistQuestGroupConfigMap().get(String.valueOf(id));
    }
    public AssistQuestGroupConfig getAssistQuestGroupData(String id) {
        return gameDataMgr.getAssistQuestGroupConfigMap().get(id);
    }
}
