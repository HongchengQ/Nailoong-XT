package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class VampireTalentDescDataService {
    private final GameDataMgr gameDataMgr;

    public VampireTalentDescConfig getVampireTalentDescData(int id) {
        return gameDataMgr.getVampireTalentDescConfigMap().get(String.valueOf(id));
    }
    public VampireTalentDescConfig getVampireTalentDescData(String id) {
        return gameDataMgr.getVampireTalentDescConfigMap().get(id);
    }

    public ArrayList<VampireTalentDescConfig> getAllVampireTalentDescData() {
        return new ArrayList<>(gameDataMgr.getVampireTalentDescConfigMap().values());
    }
}
