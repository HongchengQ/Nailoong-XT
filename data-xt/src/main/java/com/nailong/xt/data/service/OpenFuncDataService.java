package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OpenFuncDataService {
    private final GameDataMgr gameDataMgr;

    public OpenFuncConfig getOpenFuncData(int id) {
        return gameDataMgr.getOpenFuncConfigMap().get(String.valueOf(id));
    }
    public OpenFuncConfig getOpenFuncData(String id) {
        return gameDataMgr.getOpenFuncConfigMap().get(id);
    }
}
