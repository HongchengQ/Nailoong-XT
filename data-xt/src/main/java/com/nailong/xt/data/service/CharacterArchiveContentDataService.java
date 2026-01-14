package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterArchiveContentDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterArchiveContentConfig getCharacterArchiveContentData(int id) {
        return gameDataMgr.getCharacterArchiveContentConfigMap().get(String.valueOf(id));
    }
    public CharacterArchiveContentConfig getCharacterArchiveContentData(String id) {
        return gameDataMgr.getCharacterArchiveContentConfigMap().get(id);
    }
}
