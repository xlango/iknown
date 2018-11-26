package com.xhy.iknown.entity;

import lombok.Data;

@Data
public class Result<D> {

    /**错误码*/
    private int code;
    /**提示信息*/
    private String msg;
    /**具体的内容*/
    private D data;

}
