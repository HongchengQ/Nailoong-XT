package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class InteractiveActionDataService {
    private final GameDataMgr gameDataMgr;

    public InteractiveActionConfig getInteractiveActionData(int id) {
        return gameDataMgr.getInteractiveActionConfigMap().get(String.valueOf(id));
    }
    public InteractiveActionConfig getInteractiveActionData(String id) {
        return gameDataMgr.getInteractiveActionConfigMap().get(id);
    }

    public ArrayList<InteractiveActionConfig> getAllInteractiveActionData() {
        return new ArrayList<>(gameDataMgr.getInteractiveActionConfigMap().values());
    }
}
