package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<BdConvertContentConfig> getAllBdConvertContentData() {
        return new ArrayList<>(gameDataMgr.getBdConvertContentConfigMap().values());
    }
}
