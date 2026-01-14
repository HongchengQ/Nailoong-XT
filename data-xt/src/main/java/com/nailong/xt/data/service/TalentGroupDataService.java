package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TalentGroupDataService {
    private final GameDataMgr gameDataMgr;

    public TalentGroupConfig getTalentGroupData(int id) {
        return gameDataMgr.getTalentGroupConfigMap().get(String.valueOf(id));
    }
    public TalentGroupConfig getTalentGroupData(String id) {
        return gameDataMgr.getTalentGroupConfigMap().get(id);
    }
}
