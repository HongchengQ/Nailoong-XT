package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
