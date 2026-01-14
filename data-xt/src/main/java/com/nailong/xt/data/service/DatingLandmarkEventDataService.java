package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DatingLandmarkEventDataService {
    private final GameDataMgr gameDataMgr;

    public DatingLandmarkEventConfig getDatingLandmarkEventData(int id) {
        return gameDataMgr.getDatingLandmarkEventConfigMap().get(String.valueOf(id));
    }
    public DatingLandmarkEventConfig getDatingLandmarkEventData(String id) {
        return gameDataMgr.getDatingLandmarkEventConfigMap().get(id);
    }
}
