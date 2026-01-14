package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DatingStartEndEventDataService {
    private final GameDataMgr gameDataMgr;

    public DatingStartEndEventConfig getDatingStartEndEventData(int id) {
        return gameDataMgr.getDatingStartEndEventConfigMap().get(String.valueOf(id));
    }
    public DatingStartEndEventConfig getDatingStartEndEventData(String id) {
        return gameDataMgr.getDatingStartEndEventConfigMap().get(id);
    }
}
