package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StoryEvidenceDataService {
    private final GameDataMgr gameDataMgr;

    public StoryEvidenceConfig getStoryEvidenceData(int id) {
        return gameDataMgr.getStoryEvidenceConfigMap().get(String.valueOf(id));
    }
    public StoryEvidenceConfig getStoryEvidenceData(String id) {
        return gameDataMgr.getStoryEvidenceConfigMap().get(id);
    }

    public ArrayList<StoryEvidenceConfig> getAllStoryEvidenceData() {
        return new ArrayList<>(gameDataMgr.getStoryEvidenceConfigMap().values());
    }
}
