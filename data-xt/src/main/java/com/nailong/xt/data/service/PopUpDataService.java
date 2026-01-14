package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PopUpDataService {
    private final GameDataMgr gameDataMgr;

    public PopUpConfig getPopUpData(int id) {
        return gameDataMgr.getPopUpConfigMap().get(String.valueOf(id));
    }
    public PopUpConfig getPopUpData(String id) {
        return gameDataMgr.getPopUpConfigMap().get(id);
    }
}
