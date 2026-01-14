package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<GachaNewbieConfig> getAllGachaNewbieData() {
        return new ArrayList<>(gameDataMgr.getGachaNewbieConfigMap().values());
    }
}
