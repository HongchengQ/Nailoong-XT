package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CharacterArchiveVoiceDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterArchiveVoiceConfig getCharacterArchiveVoiceData(int id) {
        return gameDataMgr.getCharacterArchiveVoiceConfigMap().get(String.valueOf(id));
    }
    public CharacterArchiveVoiceConfig getCharacterArchiveVoiceData(String id) {
        return gameDataMgr.getCharacterArchiveVoiceConfigMap().get(id);
    }

    public ArrayList<CharacterArchiveVoiceConfig> getAllCharacterArchiveVoiceData() {
        return new ArrayList<>(gameDataMgr.getCharacterArchiveVoiceConfigMap().values());
    }
}
