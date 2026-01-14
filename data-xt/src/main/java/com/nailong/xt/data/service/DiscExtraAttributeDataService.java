package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<DiscExtraAttributeConfig> getAllDiscExtraAttributeData() {
        return new ArrayList<>(gameDataMgr.getDiscExtraAttributeConfigMap().values());
    }
}
