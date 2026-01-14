package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestCharacterListDataService {
    private final GameDataMgr gameDataMgr;

    public TestCharacterListConfig getTestCharacterListData(int id) {
        return gameDataMgr.getTestCharacterListConfigMap().get(String.valueOf(id));
    }
    public TestCharacterListConfig getTestCharacterListData(String id) {
        return gameDataMgr.getTestCharacterListConfigMap().get(id);
    }
}
