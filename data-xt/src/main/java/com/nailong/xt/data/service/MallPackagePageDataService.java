package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MallPackagePageDataService {
    private final GameDataMgr gameDataMgr;

    public MallPackagePageConfig getMallPackagePageData(int id) {
        return gameDataMgr.getMallPackagePageConfigMap().get(String.valueOf(id));
    }
    public MallPackagePageConfig getMallPackagePageData(String id) {
        return gameDataMgr.getMallPackagePageConfigMap().get(id);
    }
}
