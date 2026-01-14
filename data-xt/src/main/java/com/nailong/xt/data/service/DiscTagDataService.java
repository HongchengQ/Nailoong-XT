package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
