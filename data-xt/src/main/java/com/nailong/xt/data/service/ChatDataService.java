package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatDataService {
    private final GameDataMgr gameDataMgr;

    public ChatConfig getChatData(int id) {
        return gameDataMgr.getChatConfigMap().get(String.valueOf(id));
    }
    public ChatConfig getChatData(String id) {
        return gameDataMgr.getChatConfigMap().get(id);
    }
}
