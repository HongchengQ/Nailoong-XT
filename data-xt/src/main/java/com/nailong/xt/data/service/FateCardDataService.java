package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FateCardDataService {
    private final GameDataMgr gameDataMgr;

    public FateCardConfig getFateCardData(int id) {
        return gameDataMgr.getFateCardConfigMap().get(String.valueOf(id));
    }
    public FateCardConfig getFateCardData(String id) {
        return gameDataMgr.getFateCardConfigMap().get(id);
    }
}
