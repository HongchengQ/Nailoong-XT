package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TalentDataService {
    private final GameDataMgr gameDataMgr;

    public TalentConfig getTalentData(int id) {
        return gameDataMgr.getTalentConfigMap().get(String.valueOf(id));
    }
    public TalentConfig getTalentData(String id) {
        return gameDataMgr.getTalentConfigMap().get(id);
    }

    public ArrayList<TalentConfig> getAllTalentData() {
        return new ArrayList<>(gameDataMgr.getTalentConfigMap().values());
    }
}
