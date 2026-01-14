package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScriptParameterValueDataService {
    private final GameDataMgr gameDataMgr;

    public ScriptParameterValueConfig getScriptParameterValueData(int id) {
        return gameDataMgr.getScriptParameterValueConfigMap().get(String.valueOf(id));
    }
    public ScriptParameterValueConfig getScriptParameterValueData(String id) {
        return gameDataMgr.getScriptParameterValueConfigMap().get(id);
    }
}
