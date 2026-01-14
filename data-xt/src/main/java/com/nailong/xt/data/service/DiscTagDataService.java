package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DiscTagDataService {
    private final GameDataMgr gameDataMgr;

    public DiscTagConfig getDiscTagData(int id) {
        return gameDataMgr.getDiscTagConfigMap().get(String.valueOf(id));
    }
    public DiscTagConfig getDiscTagData(String id) {
        return gameDataMgr.getDiscTagConfigMap().get(id);
    }

    public ArrayList<DiscTagConfig> getAllDiscTagData() {
        return new ArrayList<>(gameDataMgr.getDiscTagConfigMap().values());
    }
}
