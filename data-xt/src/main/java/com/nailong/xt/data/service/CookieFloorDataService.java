package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CookieFloorDataService {
    private final GameDataMgr gameDataMgr;

    public CookieFloorConfig getCookieFloorData(int id) {
        return gameDataMgr.getCookieFloorConfigMap().get(String.valueOf(id));
    }
    public CookieFloorConfig getCookieFloorData(String id) {
        return gameDataMgr.getCookieFloorConfigMap().get(id);
    }
}
