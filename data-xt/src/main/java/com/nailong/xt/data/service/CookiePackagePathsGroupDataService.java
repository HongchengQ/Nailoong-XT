package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CookiePackagePathsGroupDataService {
    private final GameDataMgr gameDataMgr;

    public CookiePackagePathsGroupConfig getCookiePackagePathsGroupData(int id) {
        return gameDataMgr.getCookiePackagePathsGroupConfigMap().get(String.valueOf(id));
    }
    public CookiePackagePathsGroupConfig getCookiePackagePathsGroupData(String id) {
        return gameDataMgr.getCookiePackagePathsGroupConfigMap().get(id);
    }
}
