package com.exception;

public class BuinessException extends RuntimeException {
    private Integer code;

    public BuinessException(ResultCodeEnum resultCode){
        super(resultCode.getMsg());
        this.code = resultCode.getCode();
    }


    public BuinessException(Integer code,String msg) {
        super(msg);
        this.code = code;
    }


    public BuinessException(String msg) {
        super(msg);
    }

    public BuinessException(Throwable throwable) {
        super(throwable);
    }

    public BuinessException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

}
