package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventOptionsDataService {
    private final GameDataMgr gameDataMgr;

    public EventOptionsConfig getEventOptionsData(int id) {
        return gameDataMgr.getEventOptionsConfigMap().get(String.valueOf(id));
    }
    public EventOptionsConfig getEventOptionsData(String id) {
        return gameDataMgr.getEventOptionsConfigMap().get(id);
    }
}
