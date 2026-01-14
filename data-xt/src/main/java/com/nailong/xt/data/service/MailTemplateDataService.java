package com.nailong.xt.data.service;

import com.nailong.xt.data.GameDataMgr;
import com.nailong.xt.data.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailTemplateDataService {
    private final GameDataMgr gameDataMgr;

    public MailTemplateConfig getMailTemplateData(int id) {
        return gameDataMgr.getMailTemplateConfigMap().get(String.valueOf(id));
    }
    public MailTemplateConfig getMailTemplateData(String id) {
        return gameDataMgr.getMailTemplateConfigMap().get(id);
    }
}
