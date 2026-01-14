package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BdConvertContentDataService {
    private final GameDataMgr gameDataMgr;

    public BdConvertContentConfig getBdConvertContentData(int id) {
        return gameDataMgr.getBdConvertContentConfigMap().get(String.valueOf(id));
    }
    public BdConvertContentConfig getBdConvertContentData(String id) {
        return gameDataMgr.getBdConvertContentConfigMap().get(id);
    }
}
