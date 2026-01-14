package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ContentWordDataService {
    private final GameDataMgr gameDataMgr;

    public ContentWordConfig getContentWordData(int id) {
        return gameDataMgr.getContentWordConfigMap().get(String.valueOf(id));
    }
    public ContentWordConfig getContentWordData(String id) {
        return gameDataMgr.getContentWordConfigMap().get(id);
    }

    public ArrayList<ContentWordConfig> getAllContentWordData() {
        return new ArrayList<>(gameDataMgr.getContentWordConfigMap().values());
    }
}
