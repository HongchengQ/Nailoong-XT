package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MallMonthlyCardDataService {
    private final GameDataMgr gameDataMgr;

    public MallMonthlyCardConfig getMallMonthlyCardData(int id) {
        return gameDataMgr.getMallMonthlyCardConfigMap().get(String.valueOf(id));
    }
    public MallMonthlyCardConfig getMallMonthlyCardData(String id) {
        return gameDataMgr.getMallMonthlyCardConfigMap().get(id);
    }

    public ArrayList<MallMonthlyCardConfig> getAllMallMonthlyCardData() {
        return new ArrayList<>(gameDataMgr.getMallMonthlyCardConfigMap().values());
    }
}
