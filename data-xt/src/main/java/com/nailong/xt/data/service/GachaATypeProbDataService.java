package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GachaATypeProbDataService {
    private final GameDataMgr gameDataMgr;

    public GachaATypeProbConfig getGachaATypeProbData(int id) {
        return gameDataMgr.getGachaATypeProbConfigMap().get(String.valueOf(id));
    }
    public GachaATypeProbConfig getGachaATypeProbData(String id) {
        return gameDataMgr.getGachaATypeProbConfigMap().get(id);
    }
}
