package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class StorySetChapterDataService {
    private final GameDataMgr gameDataMgr;

    public StorySetChapterConfig getStorySetChapterData(int id) {
        return gameDataMgr.getStorySetChapterConfigMap().get(String.valueOf(id));
    }
    public StorySetChapterConfig getStorySetChapterData(String id) {
        return gameDataMgr.getStorySetChapterConfigMap().get(id);
    }

    public ArrayList<StorySetChapterConfig> getAllStorySetChapterData() {
        return new ArrayList<>(gameDataMgr.getStorySetChapterConfigMap().values());
    }
}
