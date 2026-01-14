package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DiscItemExpDataService {
    private final GameDataMgr gameDataMgr;

    public DiscItemExpConfig getDiscItemExpData(int id) {
        return gameDataMgr.getDiscItemExpConfigMap().get(String.valueOf(id));
    }
    public DiscItemExpConfig getDiscItemExpData(String id) {
        return gameDataMgr.getDiscItemExpConfigMap().get(id);
    }

    public ArrayList<DiscItemExpConfig> getAllDiscItemExpData() {
        return new ArrayList<>(gameDataMgr.getDiscItemExpConfigMap().values());
    }
}
