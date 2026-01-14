package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CharGemDataService {
    private final GameDataMgr gameDataMgr;

    public CharGemConfig getCharGemData(int id) {
        return gameDataMgr.getCharGemConfigMap().get(String.valueOf(id));
    }
    public CharGemConfig getCharGemData(String id) {
        return gameDataMgr.getCharGemConfigMap().get(id);
    }

    public ArrayList<CharGemConfig> getAllCharGemData() {
        return new ArrayList<>(gameDataMgr.getCharGemConfigMap().values());
    }
}
