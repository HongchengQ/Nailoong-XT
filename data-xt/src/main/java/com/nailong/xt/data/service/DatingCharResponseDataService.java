package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DatingCharResponseDataService {
    private final GameDataMgr gameDataMgr;

    public DatingCharResponseConfig getDatingCharResponseData(int id) {
        return gameDataMgr.getDatingCharResponseConfigMap().get(String.valueOf(id));
    }
    public DatingCharResponseConfig getDatingCharResponseData(String id) {
        return gameDataMgr.getDatingCharResponseConfigMap().get(id);
    }

    public ArrayList<DatingCharResponseConfig> getAllDatingCharResponseData() {
        return new ArrayList<>(gameDataMgr.getDatingCharResponseConfigMap().values());
    }
}
