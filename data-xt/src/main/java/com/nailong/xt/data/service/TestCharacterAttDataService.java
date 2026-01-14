package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class TestCharacterAttDataService {
    private final GameDataMgr gameDataMgr;

    public TestCharacterAttConfig getTestCharacterAttData(int id) {
        return gameDataMgr.getTestCharacterAttConfigMap().get(String.valueOf(id));
    }
    public TestCharacterAttConfig getTestCharacterAttData(String id) {
        return gameDataMgr.getTestCharacterAttConfigMap().get(id);
    }

    public ArrayList<TestCharacterAttConfig> getAllTestCharacterAttData() {
        return new ArrayList<>(gameDataMgr.getTestCharacterAttConfigMap().values());
    }
}
