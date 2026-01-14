package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ActivityStoryChapterDataService {
    private final GameDataMgr gameDataMgr;

    public ActivityStoryChapterConfig getActivityStoryChapterData(int id) {
        return gameDataMgr.getActivityStoryChapterConfigMap().get(String.valueOf(id));
    }
    public ActivityStoryChapterConfig getActivityStoryChapterData(String id) {
        return gameDataMgr.getActivityStoryChapterConfigMap().get(id);
    }

    public ArrayList<ActivityStoryChapterConfig> getAllActivityStoryChapterData() {
        return new ArrayList<>(gameDataMgr.getActivityStoryChapterConfigMap().values());
    }
}
