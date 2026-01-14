package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<ScriptParameterValueConfig> getAllScriptParameterValueData() {
        return new ArrayList<>(gameDataMgr.getScriptParameterValueConfigMap().values());
    }
}
