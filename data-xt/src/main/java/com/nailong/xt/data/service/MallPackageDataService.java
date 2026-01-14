package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MallPackageDataService {
    private final GameDataMgr gameDataMgr;

    public MallPackageConfig getMallPackageData(int id) {
        return gameDataMgr.getMallPackageConfigMap().get(String.valueOf(id));
    }
    public MallPackageConfig getMallPackageData(String id) {
        return gameDataMgr.getMallPackageConfigMap().get(id);
    }
}
