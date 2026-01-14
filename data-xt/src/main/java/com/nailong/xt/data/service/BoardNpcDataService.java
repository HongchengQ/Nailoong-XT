package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BoardNpcDataService {
    private final GameDataMgr gameDataMgr;

    public BoardNpcConfig getBoardNpcData(int id) {
        return gameDataMgr.getBoardNpcConfigMap().get(String.valueOf(id));
    }
    public BoardNpcConfig getBoardNpcData(String id) {
        return gameDataMgr.getBoardNpcConfigMap().get(id);
    }

    public ArrayList<BoardNpcConfig> getAllBoardNpcData() {
        return new ArrayList<>(gameDataMgr.getBoardNpcConfigMap().values());
    }
}
