package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CookieRhythmlResultDataService {
    private final GameDataMgr gameDataMgr;

    public CookieRhythmlResultConfig getCookieRhythmlResultData(int id) {
        return gameDataMgr.getCookieRhythmlResultConfigMap().get(String.valueOf(id));
    }
    public CookieRhythmlResultConfig getCookieRhythmlResultData(String id) {
        return gameDataMgr.getCookieRhythmlResultConfigMap().get(id);
    }

    public ArrayList<CookieRhythmlResultConfig> getAllCookieRhythmlResultData() {
        return new ArrayList<>(gameDataMgr.getCookieRhythmlResultConfigMap().values());
    }
}
