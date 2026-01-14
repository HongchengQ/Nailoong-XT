package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DatingBranchDataService {
    private final GameDataMgr gameDataMgr;

    public DatingBranchConfig getDatingBranchData(int id) {
        return gameDataMgr.getDatingBranchConfigMap().get(String.valueOf(id));
    }
    public DatingBranchConfig getDatingBranchData(String id) {
        return gameDataMgr.getDatingBranchConfigMap().get(id);
    }
}
