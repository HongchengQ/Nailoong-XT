package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DictionaryEntryDataService {
    private final GameDataMgr gameDataMgr;

    public DictionaryEntryConfig getDictionaryEntryData(int id) {
        return gameDataMgr.getDictionaryEntryConfigMap().get(String.valueOf(id));
    }
    public DictionaryEntryConfig getDictionaryEntryData(String id) {
        return gameDataMgr.getDictionaryEntryConfigMap().get(id);
    }
}
