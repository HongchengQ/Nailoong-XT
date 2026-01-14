package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class GuideDataService {
    private final GameDataMgr gameDataMgr;

    public GuideConfig getGuideData(int id) {
        return gameDataMgr.getGuideConfigMap().get(String.valueOf(id));
    }
    public GuideConfig getGuideData(String id) {
        return gameDataMgr.getGuideConfigMap().get(id);
    }

    public ArrayList<GuideConfig> getAllGuideData() {
        return new ArrayList<>(gameDataMgr.getGuideConfigMap().values());
    }
}
