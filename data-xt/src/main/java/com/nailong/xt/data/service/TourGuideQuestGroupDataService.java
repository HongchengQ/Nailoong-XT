package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TourGuideQuestGroupDataService {
    private final GameDataMgr gameDataMgr;

    public TourGuideQuestGroupConfig getTourGuideQuestGroupData(int id) {
        return gameDataMgr.getTourGuideQuestGroupConfigMap().get(String.valueOf(id));
    }
    public TourGuideQuestGroupConfig getTourGuideQuestGroupData(String id) {
        return gameDataMgr.getTourGuideQuestGroupConfigMap().get(id);
    }

    public ArrayList<TourGuideQuestGroupConfig> getAllTourGuideQuestGroupData() {
        return new ArrayList<>(gameDataMgr.getTourGuideQuestGroupConfigMap().values());
    }
}
