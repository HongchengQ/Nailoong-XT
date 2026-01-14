package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MangaLoadingDataService {
    private final GameDataMgr gameDataMgr;

    public MangaLoadingConfig getMangaLoadingData(int id) {
        return gameDataMgr.getMangaLoadingConfigMap().get(String.valueOf(id));
    }
    public MangaLoadingConfig getMangaLoadingData(String id) {
        return gameDataMgr.getMangaLoadingConfigMap().get(id);
    }

    public ArrayList<MangaLoadingConfig> getAllMangaLoadingData() {
        return new ArrayList<>(gameDataMgr.getMangaLoadingConfigMap().values());
    }
}
