package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterArchiveBaseInfoDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterArchiveBaseInfoConfig getCharacterArchiveBaseInfoData(int id) {
        return gameDataMgr.getCharacterArchiveBaseInfoConfigMap().get(String.valueOf(id));
    }
    public CharacterArchiveBaseInfoConfig getCharacterArchiveBaseInfoData(String id) {
        return gameDataMgr.getCharacterArchiveBaseInfoConfigMap().get(id);
    }
}
