package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class LoginRewardControlDataService {
    private final GameDataMgr gameDataMgr;

    public LoginRewardControlConfig getLoginRewardControlData(int id) {
        return gameDataMgr.getLoginRewardControlConfigMap().get(String.valueOf(id));
    }
    public LoginRewardControlConfig getLoginRewardControlData(String id) {
        return gameDataMgr.getLoginRewardControlConfigMap().get(id);
    }

    public ArrayList<LoginRewardControlConfig> getAllLoginRewardControlData() {
        return new ArrayList<>(gameDataMgr.getLoginRewardControlConfigMap().values());
    }
}
