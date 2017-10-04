package com.snail.commen;

/**
 * Created by panyuanyuan on 2017/6/13.
 */
public enum  ResponseCode {

    /** 成功的响应码 */
    SUCCESS(200, "SUCCESS"),

    /** 请求失败响应码 */
    ERROR(500, "ERROR"),

    /** 需要登录响应码 */
    NEED_LOGIN(403, "NEED_LOGIN"),

    /** 参数异常响应码 */
    ILLEGAL_ARGUMENT(405, "ILLEGAL_ARGUMENT");

    private final Integer code;
    private final String description;

    ResponseCode(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode () {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
