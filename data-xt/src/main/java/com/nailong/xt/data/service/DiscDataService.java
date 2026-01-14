package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DiscDataService {
    private final GameDataMgr gameDataMgr;

    public DiscConfig getDiscData(int id) {
        return gameDataMgr.getDiscConfigMap().get(String.valueOf(id));
    }
    public DiscConfig getDiscData(String id) {
        return gameDataMgr.getDiscConfigMap().get(id);
    }

    public ArrayList<DiscConfig> getAllDiscData() {
        return new ArrayList<>(gameDataMgr.getDiscConfigMap().values());
    }
}
