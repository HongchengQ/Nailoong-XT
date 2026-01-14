package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class AssistAttributeDataService {
    private final GameDataMgr gameDataMgr;

    public AssistAttributeConfig getAssistAttributeData(int id) {
        return gameDataMgr.getAssistAttributeConfigMap().get(String.valueOf(id));
    }
    public AssistAttributeConfig getAssistAttributeData(String id) {
        return gameDataMgr.getAssistAttributeConfigMap().get(id);
    }

    public ArrayList<AssistAttributeConfig> getAllAssistAttributeData() {
        return new ArrayList<>(gameDataMgr.getAssistAttributeConfigMap().values());
    }
}
