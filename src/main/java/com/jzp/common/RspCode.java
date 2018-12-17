package com.jzp.common;

/**
 * @author Hongyi Zheng
 * @date 2018/12/17
 */
public enum RspCode {

    /** response -- success*/
    SUC("200","success"),

    /** response -- system error*/
    SYS("404","system error"),

    /** response -- invalid params*/
    PARAM("401","wrong parameters");

    private String code;
    private String message;

    RspCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String code(){
        return code;
    }

    public String message(){
        return message;
    }


}
