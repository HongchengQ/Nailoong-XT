package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddBuffActionDataService {
    private final GameDataMgr gameDataMgr;

    public AddBuffActionConfig getAddBuffActionData(int id) {
        return gameDataMgr.getAddBuffActionConfigMap().get(String.valueOf(id));
    }
    public AddBuffActionConfig getAddBuffActionData(String id) {
        return gameDataMgr.getAddBuffActionConfigMap().get(id);
    }
}
