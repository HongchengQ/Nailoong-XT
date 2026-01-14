package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TutorialLevelFloorDataService {
    private final GameDataMgr gameDataMgr;

    public TutorialLevelFloorConfig getTutorialLevelFloorData(int id) {
        return gameDataMgr.getTutorialLevelFloorConfigMap().get(String.valueOf(id));
    }
    public TutorialLevelFloorConfig getTutorialLevelFloorData(String id) {
        return gameDataMgr.getTutorialLevelFloorConfigMap().get(id);
    }
}
