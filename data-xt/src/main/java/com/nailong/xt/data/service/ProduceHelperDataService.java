package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProduceHelperDataService {
    private final GameDataMgr gameDataMgr;

    public ProduceHelperConfig getProduceHelperData(int id) {
        return gameDataMgr.getProduceHelperConfigMap().get(String.valueOf(id));
    }
    public ProduceHelperConfig getProduceHelperData(String id) {
        return gameDataMgr.getProduceHelperConfigMap().get(id);
    }
}
