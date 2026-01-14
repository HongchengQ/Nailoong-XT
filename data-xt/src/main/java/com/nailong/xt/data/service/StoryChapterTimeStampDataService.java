package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoryChapterTimeStampDataService {
    private final GameDataMgr gameDataMgr;

    public StoryChapterTimeStampConfig getStoryChapterTimeStampData(int id) {
        return gameDataMgr.getStoryChapterTimeStampConfigMap().get(String.valueOf(id));
    }
    public StoryChapterTimeStampConfig getStoryChapterTimeStampData(String id) {
        return gameDataMgr.getStoryChapterTimeStampConfigMap().get(id);
    }
}
