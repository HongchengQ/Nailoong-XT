package com.nailong.xt.common.enums;

// 不要使用下划线 spring不兼容
public enum ServerTypeEnum {
    NONE(0),
    SdkServer(1),
    DispatchServer(2),
    GateServer(3),
    GameServer(4);

    final int value;

    ServerTypeEnum(int value) {
        this.value = value;
    }
}
