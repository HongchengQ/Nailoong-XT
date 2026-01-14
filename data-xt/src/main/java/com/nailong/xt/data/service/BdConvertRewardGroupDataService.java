package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BdConvertRewardGroupDataService {
    private final GameDataMgr gameDataMgr;

    public BdConvertRewardGroupConfig getBdConvertRewardGroupData(int id) {
        return gameDataMgr.getBdConvertRewardGroupConfigMap().get(String.valueOf(id));
    }
    public BdConvertRewardGroupConfig getBdConvertRewardGroupData(String id) {
        return gameDataMgr.getBdConvertRewardGroupConfigMap().get(id);
    }

    public ArrayList<BdConvertRewardGroupConfig> getAllBdConvertRewardGroupData() {
        return new ArrayList<>(gameDataMgr.getBdConvertRewardGroupConfigMap().values());
    }
}
