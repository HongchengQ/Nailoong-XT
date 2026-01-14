package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DictionaryTabDataService {
    private final GameDataMgr gameDataMgr;

    public DictionaryTabConfig getDictionaryTabData(int id) {
        return gameDataMgr.getDictionaryTabConfigMap().get(String.valueOf(id));
    }
    public DictionaryTabConfig getDictionaryTabData(String id) {
        return gameDataMgr.getDictionaryTabConfigMap().get(id);
    }
}
