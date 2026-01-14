package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<MallPackagePageConfig> getAllMallPackagePageData() {
        return new ArrayList<>(gameDataMgr.getMallPackagePageConfigMap().values());
    }
}
