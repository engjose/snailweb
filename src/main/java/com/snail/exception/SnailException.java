package com.snail.exception;

/**
 * 自定义客户端异常类
 *
 * Created by panyuanyuan 2017/10/4
 */
public class SnailException extends RuntimeException{

    /** 版本号 */
    private static final long serialVersionID = -1814878190103898946L;

    /** 返回code */
    private int code;

    /** 返回信息 */
    private String message;

    public SnailException(int code, String message) {
        super(message);
        this.code = code;
    }

    public SnailException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
