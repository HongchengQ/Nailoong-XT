package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class VoDirectoryDataService {
    private final GameDataMgr gameDataMgr;

    public VoDirectoryConfig getVoDirectoryData(int id) {
        return gameDataMgr.getVoDirectoryConfigMap().get(String.valueOf(id));
    }
    public VoDirectoryConfig getVoDirectoryData(String id) {
        return gameDataMgr.getVoDirectoryConfigMap().get(id);
    }

    public ArrayList<VoDirectoryConfig> getAllVoDirectoryData() {
        return new ArrayList<>(gameDataMgr.getVoDirectoryConfigMap().values());
    }
}
