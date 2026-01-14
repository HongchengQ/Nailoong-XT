package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BdConvertDataService {
    private final GameDataMgr gameDataMgr;

    public BdConvertConfig getBdConvertData(int id) {
        return gameDataMgr.getBdConvertConfigMap().get(String.valueOf(id));
    }
    public BdConvertConfig getBdConvertData(String id) {
        return gameDataMgr.getBdConvertConfigMap().get(id);
    }

    public ArrayList<BdConvertConfig> getAllBdConvertData() {
        return new ArrayList<>(gameDataMgr.getBdConvertConfigMap().values());
    }
}
