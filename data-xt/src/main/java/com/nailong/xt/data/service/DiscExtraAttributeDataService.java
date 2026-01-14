package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiscExtraAttributeDataService {
    private final GameDataMgr gameDataMgr;

    public DiscExtraAttributeConfig getDiscExtraAttributeData(int id) {
        return gameDataMgr.getDiscExtraAttributeConfigMap().get(String.valueOf(id));
    }
    public DiscExtraAttributeConfig getDiscExtraAttributeData(String id) {
        return gameDataMgr.getDiscExtraAttributeConfigMap().get(id);
    }
}
