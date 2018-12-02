package com.xhy.iknown.entity;

import lombok.Data;

@Data
public class Message<D> {

    int code;
    String msg;
    D data;
}
