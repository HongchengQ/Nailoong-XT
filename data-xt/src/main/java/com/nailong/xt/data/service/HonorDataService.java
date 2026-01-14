package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HonorDataService {
    private final GameDataMgr gameDataMgr;

    public HonorConfig getHonorData(int id) {
        return gameDataMgr.getHonorConfigMap().get(String.valueOf(id));
    }
    public HonorConfig getHonorData(String id) {
        return gameDataMgr.getHonorConfigMap().get(id);
    }
}
