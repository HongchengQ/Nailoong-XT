package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoryChapterDataService {
    private final GameDataMgr gameDataMgr;

    public StoryChapterConfig getStoryChapterData(int id) {
        return gameDataMgr.getStoryChapterConfigMap().get(String.valueOf(id));
    }
    public StoryChapterConfig getStoryChapterData(String id) {
        return gameDataMgr.getStoryChapterConfigMap().get(id);
    }
}
