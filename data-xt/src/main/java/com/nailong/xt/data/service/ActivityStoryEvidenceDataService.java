package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActivityStoryEvidenceDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityStoryEvidenceConfig getActivityStoryEvidenceData(int id) {
        return gameDataMgr.getActivityStoryEvidenceConfigMap().get(String.valueOf(id));
    }
    public ActivityStoryEvidenceConfig getActivityStoryEvidenceData(String id) {
        return gameDataMgr.getActivityStoryEvidenceConfigMap().get(id);
    }
}
