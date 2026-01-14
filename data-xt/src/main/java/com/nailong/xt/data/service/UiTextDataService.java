package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UiTextDataService {
    private final GameDataMgr gameDataMgr;

    public UiTextConfig getUiTextData(int id) {
        return gameDataMgr.getUiTextConfigMap().get(String.valueOf(id));
    }
    public UiTextConfig getUiTextData(String id) {
        return gameDataMgr.getUiTextConfigMap().get(id);
    }
}
