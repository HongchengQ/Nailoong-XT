package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HonorCharacterDataService {
    private final GameDataMgr gameDataMgr;

    public HonorCharacterConfig getHonorCharacterData(int id) {
        return gameDataMgr.getHonorCharacterConfigMap().get(String.valueOf(id));
    }
    public HonorCharacterConfig getHonorCharacterData(String id) {
        return gameDataMgr.getHonorCharacterConfigMap().get(id);
    }
}
