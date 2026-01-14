package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DatingCharacterEventDataService {
    private final GameDataMgr gameDataMgr;

    public DatingCharacterEventConfig getDatingCharacterEventData(int id) {
        return gameDataMgr.getDatingCharacterEventConfigMap().get(String.valueOf(id));
    }
    public DatingCharacterEventConfig getDatingCharacterEventData(String id) {
        return gameDataMgr.getDatingCharacterEventConfigMap().get(id);
    }

    public ArrayList<DatingCharacterEventConfig> getAllDatingCharacterEventData() {
        return new ArrayList<>(gameDataMgr.getDatingCharacterEventConfigMap().values());
    }
}
