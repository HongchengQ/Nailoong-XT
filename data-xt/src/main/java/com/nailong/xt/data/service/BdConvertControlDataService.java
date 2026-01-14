package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BdConvertControlDataService {
    private final GameDataMgr gameDataMgr;

    public BdConvertControlConfig getBdConvertControlData(int id) {
        return gameDataMgr.getBdConvertControlConfigMap().get(String.valueOf(id));
    }
    public BdConvertControlConfig getBdConvertControlData(String id) {
        return gameDataMgr.getBdConvertControlConfigMap().get(id);
    }
}
