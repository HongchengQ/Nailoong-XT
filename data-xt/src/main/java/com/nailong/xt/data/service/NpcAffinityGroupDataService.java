package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<NpcAffinityGroupConfig> getAllNpcAffinityGroupData() {
        return new ArrayList<>(gameDataMgr.getNpcAffinityGroupConfigMap().values());
    }
}
