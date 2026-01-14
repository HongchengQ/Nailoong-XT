package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NpcAffinityGroupDataService {
    private final GameDataMgr gameDataMgr;

    public NpcAffinityGroupConfig getNpcAffinityGroupData(int id) {
        return gameDataMgr.getNpcAffinityGroupConfigMap().get(String.valueOf(id));
    }
    public NpcAffinityGroupConfig getNpcAffinityGroupData(String id) {
        return gameDataMgr.getNpcAffinityGroupConfigMap().get(id);
    }
}
