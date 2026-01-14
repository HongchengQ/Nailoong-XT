package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ChapterDataService {
    private final GameDataMgr gameDataMgr;

    public ChapterConfig getChapterData(int id) {
        return gameDataMgr.getChapterConfigMap().get(String.valueOf(id));
    }
    public ChapterConfig getChapterData(String id) {
        return gameDataMgr.getChapterConfigMap().get(id);
    }

    public ArrayList<ChapterConfig> getAllChapterData() {
        return new ArrayList<>(gameDataMgr.getChapterConfigMap().values());
    }
}
