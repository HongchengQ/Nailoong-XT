package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JumpToDataService {
    private final GameDataMgr gameDataMgr;

    public JumpToConfig getJumpToData(int id) {
        return gameDataMgr.getJumpToConfigMap().get(String.valueOf(id));
    }
    public JumpToConfig getJumpToData(String id) {
        return gameDataMgr.getJumpToConfigMap().get(id);
    }
}
