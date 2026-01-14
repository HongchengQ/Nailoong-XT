package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DictionaryTopBarEntryDataService {
    private final GameDataMgr gameDataMgr;

    public DictionaryTopBarEntryConfig getDictionaryTopBarEntryData(int id) {
        return gameDataMgr.getDictionaryTopBarEntryConfigMap().get(String.valueOf(id));
    }
    public DictionaryTopBarEntryConfig getDictionaryTopBarEntryData(String id) {
        return gameDataMgr.getDictionaryTopBarEntryConfigMap().get(id);
    }
}
