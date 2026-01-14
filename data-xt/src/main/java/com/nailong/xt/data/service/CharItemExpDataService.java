package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CharItemExpDataService {
    private final GameDataMgr gameDataMgr;

    public CharItemExpConfig getCharItemExpData(int id) {
        return gameDataMgr.getCharItemExpConfigMap().get(String.valueOf(id));
    }
    public CharItemExpConfig getCharItemExpData(String id) {
        return gameDataMgr.getCharItemExpConfigMap().get(id);
    }

    public ArrayList<CharItemExpConfig> getAllCharItemExpData() {
        return new ArrayList<>(gameDataMgr.getCharItemExpConfigMap().values());
    }
}
