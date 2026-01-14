package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrialDiscDataService {
    private final GameDataMgr gameDataMgr;

    public TrialDiscConfig getTrialDiscData(int id) {
        return gameDataMgr.getTrialDiscConfigMap().get(String.valueOf(id));
    }
    public TrialDiscConfig getTrialDiscData(String id) {
        return gameDataMgr.getTrialDiscConfigMap().get(id);
    }
}
