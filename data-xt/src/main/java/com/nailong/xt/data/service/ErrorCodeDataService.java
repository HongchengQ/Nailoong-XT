package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ErrorCodeDataService {
    private final GameDataMgr gameDataMgr;

    public ErrorCodeConfig getErrorCodeData(int id) {
        return gameDataMgr.getErrorCodeConfigMap().get(String.valueOf(id));
    }
    public ErrorCodeConfig getErrorCodeData(String id) {
        return gameDataMgr.getErrorCodeConfigMap().get(id);
    }

    public ArrayList<ErrorCodeConfig> getAllErrorCodeData() {
        return new ArrayList<>(gameDataMgr.getErrorCodeConfigMap().values());
    }
}
