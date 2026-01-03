package com.nailong.xt.common.proto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Packet {
    int cmdId;
    byte[] proto;
}
