package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DatingCharTagDataService {
    private final GameDataMgr gameDataMgr;

    public DatingCharTagConfig getDatingCharTagData(int id) {
        return gameDataMgr.getDatingCharTagConfigMap().get(String.valueOf(id));
    }
    public DatingCharTagConfig getDatingCharTagData(String id) {
        return gameDataMgr.getDatingCharTagConfigMap().get(id);
    }

    public ArrayList<DatingCharTagConfig> getAllDatingCharTagData() {
        return new ArrayList<>(gameDataMgr.getDatingCharTagConfigMap().values());
    }
}
