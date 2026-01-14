package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class GamepadButtonDataService {
    private final GameDataMgr gameDataMgr;

    public GamepadButtonConfig getGamepadButtonData(int id) {
        return gameDataMgr.getGamepadButtonConfigMap().get(String.valueOf(id));
    }
    public GamepadButtonConfig getGamepadButtonData(String id) {
        return gameDataMgr.getGamepadButtonConfigMap().get(id);
    }

    public ArrayList<GamepadButtonConfig> getAllGamepadButtonData() {
        return new ArrayList<>(gameDataMgr.getGamepadButtonConfigMap().values());
    }
}
