package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class PopUpSequenceDataService {
    private final GameDataMgr gameDataMgr;

    public PopUpSequenceConfig getPopUpSequenceData(int id) {
        return gameDataMgr.getPopUpSequenceConfigMap().get(String.valueOf(id));
    }
    public PopUpSequenceConfig getPopUpSequenceData(String id) {
        return gameDataMgr.getPopUpSequenceConfigMap().get(id);
    }

    public ArrayList<PopUpSequenceConfig> getAllPopUpSequenceData() {
        return new ArrayList<>(gameDataMgr.getPopUpSequenceConfigMap().values());
    }
}
