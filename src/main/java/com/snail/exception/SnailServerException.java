package com.snail.exception;

/**
 * 自定义服务端异常类
 *
 * Created by panyuanyuan 2017/10/4
 */
public class SnailServerException extends SnailException {
    /** 版本号 */
    private static final long serialVersionUID = 9101707834968139311L;

    /**
     * 默认异常
     */
    public SnailServerException() {
        super(1001, "系统忙不过来啦，稍等一下");
    }

    /**
     * code, message:异常
     *
     * @param code
     * @param message
     */
    public SnailServerException(int code, String message) {
        super(code, message);
    }

    /**
     * code, message, e:异常
     *
     * @param code
     * @param message
     * @param cause
     */
    public SnailServerException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
