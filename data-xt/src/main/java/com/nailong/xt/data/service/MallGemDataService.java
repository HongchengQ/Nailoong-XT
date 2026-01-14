package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MallGemDataService {
    private final GameDataMgr gameDataMgr;

    public MallGemConfig getMallGemData(int id) {
        return gameDataMgr.getMallGemConfigMap().get(String.valueOf(id));
    }
    public MallGemConfig getMallGemData(String id) {
        return gameDataMgr.getMallGemConfigMap().get(id);
    }
}
