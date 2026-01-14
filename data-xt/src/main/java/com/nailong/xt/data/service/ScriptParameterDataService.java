package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScriptParameterDataService {
    private final GameDataMgr gameDataMgr;

    public ScriptParameterConfig getScriptParameterData(int id) {
        return gameDataMgr.getScriptParameterConfigMap().get(String.valueOf(id));
    }
    public ScriptParameterConfig getScriptParameterData(String id) {
        return gameDataMgr.getScriptParameterConfigMap().get(id);
    }
}
