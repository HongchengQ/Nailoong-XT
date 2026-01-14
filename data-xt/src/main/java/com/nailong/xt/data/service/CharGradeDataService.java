package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CharGradeDataService {
    private final GameDataMgr gameDataMgr;

    public CharGradeConfig getCharGradeData(int id) {
        return gameDataMgr.getCharGradeConfigMap().get(String.valueOf(id));
    }
    public CharGradeConfig getCharGradeData(String id) {
        return gameDataMgr.getCharGradeConfigMap().get(id);
    }

    public ArrayList<CharGradeConfig> getAllCharGradeData() {
        return new ArrayList<>(gameDataMgr.getCharGradeConfigMap().values());
    }
}
