package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignInDataService {
    private final GameDataMgr gameDataMgr;

    public SignInConfig getSignInData(int id) {
        return gameDataMgr.getSignInConfigMap().get(String.valueOf(id));
    }
    public SignInConfig getSignInData(String id) {
        return gameDataMgr.getSignInConfigMap().get(id);
    }
}
