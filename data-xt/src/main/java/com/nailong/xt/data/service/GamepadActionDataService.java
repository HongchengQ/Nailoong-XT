package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class GamepadActionDataService {
    private final GameDataMgr gameDataMgr;

    public GamepadActionConfig getGamepadActionData(int id) {
        return gameDataMgr.getGamepadActionConfigMap().get(String.valueOf(id));
    }
    public GamepadActionConfig getGamepadActionData(String id) {
        return gameDataMgr.getGamepadActionConfigMap().get(id);
    }

    public ArrayList<GamepadActionConfig> getAllGamepadActionData() {
        return new ArrayList<>(gameDataMgr.getGamepadActionConfigMap().values());
    }
}
