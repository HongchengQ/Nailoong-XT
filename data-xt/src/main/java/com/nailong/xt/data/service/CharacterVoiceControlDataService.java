package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterVoiceControlDataService {
    private final GameDataMgr gameDataMgr;

    public CharacterVoiceControlConfig getCharacterVoiceControlData(int id) {
        return gameDataMgr.getCharacterVoiceControlConfigMap().get(String.valueOf(id));
    }
    public CharacterVoiceControlConfig getCharacterVoiceControlData(String id) {
        return gameDataMgr.getCharacterVoiceControlConfigMap().get(id);
    }
}
