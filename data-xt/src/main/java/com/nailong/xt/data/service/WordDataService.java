package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WordDataService {
    private final GameDataMgr gameDataMgr;

    public WordConfig getWordData(int id) {
        return gameDataMgr.getWordConfigMap().get(String.valueOf(id));
    }
    public WordConfig getWordData(String id) {
        return gameDataMgr.getWordConfigMap().get(id);
    }
}
