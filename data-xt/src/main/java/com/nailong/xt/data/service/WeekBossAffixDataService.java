package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class WeekBossAffixDataService {
    private final GameDataMgr gameDataMgr;

    public WeekBossAffixConfig getWeekBossAffixData(int id) {
        return gameDataMgr.getWeekBossAffixConfigMap().get(String.valueOf(id));
    }
    public WeekBossAffixConfig getWeekBossAffixData(String id) {
        return gameDataMgr.getWeekBossAffixConfigMap().get(id);
    }

    public ArrayList<WeekBossAffixConfig> getAllWeekBossAffixData() {
        return new ArrayList<>(gameDataMgr.getWeekBossAffixConfigMap().values());
    }
}
