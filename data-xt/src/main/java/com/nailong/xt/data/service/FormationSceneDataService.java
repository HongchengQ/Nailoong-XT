package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FormationSceneDataService {
    private final GameDataMgr gameDataMgr;

    public FormationSceneConfig getFormationSceneData(int id) {
        return gameDataMgr.getFormationSceneConfigMap().get(String.valueOf(id));
    }
    public FormationSceneConfig getFormationSceneData(String id) {
        return gameDataMgr.getFormationSceneConfigMap().get(id);
    }
}
