package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharGemAttrValueDataService {
    private final GameDataMgr gameDataMgr;

    public CharGemAttrValueConfig getCharGemAttrValueData(int id) {
        return gameDataMgr.getCharGemAttrValueConfigMap().get(String.valueOf(id));
    }
    public CharGemAttrValueConfig getCharGemAttrValueData(String id) {
        return gameDataMgr.getCharGemAttrValueConfigMap().get(id);
    }
}
