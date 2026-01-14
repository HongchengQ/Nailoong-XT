package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DictionaryDiagramDataService {
    private final GameDataMgr gameDataMgr;

    public DictionaryDiagramConfig getDictionaryDiagramData(int id) {
        return gameDataMgr.getDictionaryDiagramConfigMap().get(String.valueOf(id));
    }
    public DictionaryDiagramConfig getDictionaryDiagramData(String id) {
        return gameDataMgr.getDictionaryDiagramConfigMap().get(id);
    }
}
