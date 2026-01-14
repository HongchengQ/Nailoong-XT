package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GachaNewbieDataService {
    private final GameDataMgr gameDataMgr;

    public GachaNewbieConfig getGachaNewbieData(int id) {
        return gameDataMgr.getGachaNewbieConfigMap().get(String.valueOf(id));
    }
    public GachaNewbieConfig getGachaNewbieData(String id) {
        return gameDataMgr.getGachaNewbieConfigMap().get(id);
    }
}
