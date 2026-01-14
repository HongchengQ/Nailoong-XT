package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PreviewMonsterGroupDataService {
    private final GameDataMgr gameDataMgr;

    public PreviewMonsterGroupConfig getPreviewMonsterGroupData(int id) {
        return gameDataMgr.getPreviewMonsterGroupConfigMap().get(String.valueOf(id));
    }
    public PreviewMonsterGroupConfig getPreviewMonsterGroupData(String id) {
        return gameDataMgr.getPreviewMonsterGroupConfigMap().get(id);
    }
}
