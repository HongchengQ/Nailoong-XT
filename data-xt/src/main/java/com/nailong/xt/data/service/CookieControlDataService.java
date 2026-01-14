package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CookieControlDataService {
    private final GameDataMgr gameDataMgr;

    public CookieControlConfig getCookieControlData(int id) {
        return gameDataMgr.getCookieControlConfigMap().get(String.valueOf(id));
    }
    public CookieControlConfig getCookieControlData(String id) {
        return gameDataMgr.getCookieControlConfigMap().get(id);
    }
}
