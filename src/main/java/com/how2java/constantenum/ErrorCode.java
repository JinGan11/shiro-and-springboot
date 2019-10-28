package com.how2java.constantenum;

/**
 * Description: 异常枚举类
 *
 * @author gan.jin@ucarinc.com
 * @version 1.0
 * @Date 2019/10/28 10:38
 */
public enum ErrorCode {

    //枚举状态
    REQ_PARAM_ERR(10001,"请求参数异常"),
    NOTFOUND_RESULT_ERR(10004,"未找到结果");

    private int code;

    ErrorCode(int code,String msg){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
