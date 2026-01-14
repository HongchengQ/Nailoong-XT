package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class EventResultDataService {
    private final GameDataMgr gameDataMgr;

    public EventResultConfig getEventResultData(int id) {
        return gameDataMgr.getEventResultConfigMap().get(String.valueOf(id));
    }
    public EventResultConfig getEventResultData(String id) {
        return gameDataMgr.getEventResultConfigMap().get(id);
    }

    public ArrayList<EventResultConfig> getAllEventResultData() {
        return new ArrayList<>(gameDataMgr.getEventResultConfigMap().values());
    }
}
