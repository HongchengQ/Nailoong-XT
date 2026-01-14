package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DiscIpDataService {
    private final GameDataMgr gameDataMgr;

    public DiscIpConfig getDiscIpData(int id) {
        return gameDataMgr.getDiscIpConfigMap().get(String.valueOf(id));
    }
    public DiscIpConfig getDiscIpData(String id) {
        return gameDataMgr.getDiscIpConfigMap().get(id);
    }

    public ArrayList<DiscIpConfig> getAllDiscIpData() {
        return new ArrayList<>(gameDataMgr.getDiscIpConfigMap().values());
    }
}
