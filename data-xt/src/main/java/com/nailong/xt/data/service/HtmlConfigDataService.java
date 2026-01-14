package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class HtmlConfigDataService {
    private final GameDataMgr gameDataMgr;

    public HtmlConfigConfig getHtmlConfigData(int id) {
        return gameDataMgr.getHtmlConfigConfigMap().get(String.valueOf(id));
    }
    public HtmlConfigConfig getHtmlConfigData(String id) {
        return gameDataMgr.getHtmlConfigConfigMap().get(id);
    }

    public ArrayList<HtmlConfigConfig> getAllHtmlConfigData() {
        return new ArrayList<>(gameDataMgr.getHtmlConfigConfigMap().values());
    }
}
