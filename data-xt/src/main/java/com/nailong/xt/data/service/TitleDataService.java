package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TitleDataService {
    private final GameDataMgr gameDataMgr;

    public TitleConfig getTitleData(int id) {
        return gameDataMgr.getTitleConfigMap().get(String.valueOf(id));
    }
    public TitleConfig getTitleData(String id) {
        return gameDataMgr.getTitleConfigMap().get(id);
    }

    public ArrayList<TitleConfig> getAllTitleData() {
        return new ArrayList<>(gameDataMgr.getTitleConfigMap().values());
    }
}
