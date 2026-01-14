package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DestroyObjectSprDataService {
    private final GameDataMgr gameDataMgr;

    public DestroyObjectSprConfig getDestroyObjectSprData(int id) {
        return gameDataMgr.getDestroyObjectSprConfigMap().get(String.valueOf(id));
    }
    public DestroyObjectSprConfig getDestroyObjectSprData(String id) {
        return gameDataMgr.getDestroyObjectSprConfigMap().get(id);
    }
}
