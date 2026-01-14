package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TopBarDataService {
    private final GameDataMgr gameDataMgr;

    public TopBarConfig getTopBarData(int id) {
        return gameDataMgr.getTopBarConfigMap().get(String.valueOf(id));
    }
    public TopBarConfig getTopBarData(String id) {
        return gameDataMgr.getTopBarConfigMap().get(id);
    }
}
