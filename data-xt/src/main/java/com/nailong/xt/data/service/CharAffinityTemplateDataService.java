package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharAffinityTemplateDataService {
    private final GameDataMgr gameDataMgr;

    public CharAffinityTemplateConfig getCharAffinityTemplateData(int id) {
        return gameDataMgr.getCharAffinityTemplateConfigMap().get(String.valueOf(id));
    }
    public CharAffinityTemplateConfig getCharAffinityTemplateData(String id) {
        return gameDataMgr.getCharAffinityTemplateConfigMap().get(id);
    }
}
