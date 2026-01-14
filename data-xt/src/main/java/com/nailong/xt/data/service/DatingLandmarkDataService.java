package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DatingLandmarkDataService {
    private final GameDataMgr gameDataMgr;

    public DatingLandmarkConfig getDatingLandmarkData(int id) {
        return gameDataMgr.getDatingLandmarkConfigMap().get(String.valueOf(id));
    }
    public DatingLandmarkConfig getDatingLandmarkData(String id) {
        return gameDataMgr.getDatingLandmarkConfigMap().get(id);
    }
}
