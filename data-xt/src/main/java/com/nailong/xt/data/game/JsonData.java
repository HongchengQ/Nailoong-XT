package com.nailong.xt.data.game;

import com.nailong.xt.data.annotation.GameDataName;
import org.springframework.stereotype.Component;

@Component
public class JsonData {
    @GameDataName(name = "1")
    public void uuu() {
        IO.println(777777777);
    }
}
