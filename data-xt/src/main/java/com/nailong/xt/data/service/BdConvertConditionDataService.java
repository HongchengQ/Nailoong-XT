package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BdConvertConditionDataService {
    private final GameDataMgr gameDataMgr;

    public BdConvertConditionConfig getBdConvertConditionData(int id) {
        return gameDataMgr.getBdConvertConditionConfigMap().get(String.valueOf(id));
    }
    public BdConvertConditionConfig getBdConvertConditionData(String id) {
        return gameDataMgr.getBdConvertConditionConfigMap().get(id);
    }

    public ArrayList<BdConvertConditionConfig> getAllBdConvertConditionData() {
        return new ArrayList<>(gameDataMgr.getBdConvertConditionConfigMap().values());
    }
}
