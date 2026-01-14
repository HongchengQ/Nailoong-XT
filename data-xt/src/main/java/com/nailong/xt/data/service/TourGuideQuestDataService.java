package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TourGuideQuestDataService {
    private final GameDataMgr gameDataMgr;

    public TourGuideQuestConfig getTourGuideQuestData(int id) {
        return gameDataMgr.getTourGuideQuestConfigMap().get(String.valueOf(id));
    }
    public TourGuideQuestConfig getTourGuideQuestData(String id) {
        return gameDataMgr.getTourGuideQuestConfigMap().get(id);
    }

    public ArrayList<TourGuideQuestConfig> getAllTourGuideQuestData() {
        return new ArrayList<>(gameDataMgr.getTourGuideQuestConfigMap().values());
    }
}
