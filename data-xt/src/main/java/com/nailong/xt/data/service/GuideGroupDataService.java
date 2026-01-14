package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GuideGroupDataService {
    private final GameDataMgr gameDataMgr;

    public GuideGroupConfig getGuideGroupData(int id) {
        return gameDataMgr.getGuideGroupConfigMap().get(String.valueOf(id));
    }
    public GuideGroupConfig getGuideGroupData(String id) {
        return gameDataMgr.getGuideGroupConfigMap().get(id);
    }
}
