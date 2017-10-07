package com.snail.common.enums;

/**
 * 使用状态枚举
 *
 * Created by panyuanyuan on 2017/10/7.
 */
public enum UseStatusEnum {
    USE("USE", 1, "上架"),
    UN_USE("UN_USE", 0, "下架");

    /** 使用状态 */
    private String status;

    /** code */
    private Integer code;

    /** 描述 */
    private String desc;

    UseStatusEnum(String status, Integer code, String desc) {
        this.status = status;
        this.code = code;
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
