package com.system.cakedemo.utils;

public enum ResultCode {
    THIRDSERVER_RESPONSE_EXCEPTION(101,"服务中心返回数据异常","服务中心返回数据异常"),
    THIRDSERVER_REQUEST_EXCEPTION(100,"服务中心连接异常","服务中心连接%s异常"),

    // 全局
    GLOBAL_REQUEST_OK(0,"请求成功标志","请求成功"),
    GLOBAL_REQUEST_FAIL(1,"请求失败标志","请求失败"),
    GLOBAL_NOT_LOGIN(-130,"未登录标志","未登录"),
    GLOBAL_TOKEN_MISSING(3,"token缺失","没有token参数"),
    GLOBAL_TOKEN_INVALID(4,"token无效","需要重新获取token"),
    BANLANCE_FAIL(5,"运维金额不足,请稍后再试","运维金额不足,请稍后再试"),
    GLOBAL_PARAM_MISSING(9,"全局参数缺失","全局参数缺失"),


    //其他错误
    OTHER_IMAGE_EMPTY(90,"上传文件不能为空","上传文件不能为空"),
    OTHER_UPLOAD_FAIL(93,"上传文件失败","上传文件失败"),
    OTHER_DATATYPE_FAIL(94,"数据类错误","数据类型错误"),
    OTHER_ERROR(999,"自定义异常","自定义异常");




    private int code;
    private String description;
    private String msg;

    ResultCode(int code, String description, String msg) {
        this.code = code;
        this.description = description;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        ResultCode[] list = ResultCode.values();
        System.out.println("switch(code){");
        for (ResultCode res : list){
            System.out.println("\tcase " + res.getCode() + ":");
            System.out.println("\t\tmsg = \"" + res.getMsg() + "\";");
            System.out.println("\t\tbreak;");
        }
        System.out.println("}");
    }
}
