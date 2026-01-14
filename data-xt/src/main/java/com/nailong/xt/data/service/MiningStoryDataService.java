package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MiningStoryDataService {
    private final GameDataMgr gameDataMgr;

    public MiningStoryConfig getMiningStoryData(int id) {
        return gameDataMgr.getMiningStoryConfigMap().get(String.valueOf(id));
    }
    public MiningStoryConfig getMiningStoryData(String id) {
        return gameDataMgr.getMiningStoryConfigMap().get(id);
    }
}
