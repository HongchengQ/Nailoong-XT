package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginRewardGroupDataService {
    private final GameDataMgr gameDataMgr;

    public LoginRewardGroupConfig getLoginRewardGroupData(int id) {
        return gameDataMgr.getLoginRewardGroupConfigMap().get(String.valueOf(id));
    }
    public LoginRewardGroupConfig getLoginRewardGroupData(String id) {
        return gameDataMgr.getLoginRewardGroupConfigMap().get(id);
    }
}
