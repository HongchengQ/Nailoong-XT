package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TutorialLevelDataService {
    private final GameDataMgr gameDataMgr;

    public TutorialLevelConfig getTutorialLevelData(int id) {
        return gameDataMgr.getTutorialLevelConfigMap().get(String.valueOf(id));
    }
    public TutorialLevelConfig getTutorialLevelData(String id) {
        return gameDataMgr.getTutorialLevelConfigMap().get(id);
    }
}
