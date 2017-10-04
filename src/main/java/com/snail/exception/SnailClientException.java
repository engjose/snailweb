package com.snail.exception;

/**
 * 自定义客户端异常
 *
 * Created by panyuanyuan 2017/10/4
 */
public class SnailClientException extends SnailException{

    /** 版本号 */
    private static final long serialVersionUID = 9101707834968139310L;

    /**
     * 默认异常
     */
    public SnailClientException() {
        super(1001, "系统忙不过来啦，稍等一下");
    }

    /**
     * code, message:异常
     *
     * @param code
     * @param message
     */
    public SnailClientException(int code, String message) {
        super(code, message);
    }

    /**
     * code, message, e:异常
     *
     * @param code
     * @param message
     * @param cause
     */
    public SnailClientException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
