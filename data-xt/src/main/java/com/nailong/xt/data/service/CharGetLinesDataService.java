package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharGetLinesDataService {
    private final GameDataMgr gameDataMgr;

    public CharGetLinesConfig getCharGetLinesData(int id) {
        return gameDataMgr.getCharGetLinesConfigMap().get(String.valueOf(id));
    }
    public CharGetLinesConfig getCharGetLinesData(String id) {
        return gameDataMgr.getCharGetLinesConfigMap().get(id);
    }
}
