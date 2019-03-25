package com.system.cakedemo.utils;

import java.util.HashMap;
import java.util.Map;

/* *
 *  Created by 刁民 on 2017/8/17.
 *  Description  描述本文件做什么
 */
public class ResMsg {
    public static Map<String,Object> success(){
        Map<String,Object> map = new HashMap();
        map.put("code", ResultCode.GLOBAL_REQUEST_OK.getCode());
        map.put("msg",ResultCode.GLOBAL_REQUEST_OK.getMsg());
        return map;
    }
    public static Map<String,Object> success(String msg){
        Map<String,Object> map = new HashMap();
        map.put("code",ResultCode.GLOBAL_REQUEST_OK.getCode());
        map.put("msg",msg);
        return map;
    }
    public static Map<String,Object> success(Object object){
        Map<String,Object> map = new HashMap();
        map.put("code",ResultCode.GLOBAL_REQUEST_OK.getCode());
        map.put("msg",ResultCode.GLOBAL_REQUEST_OK.getMsg());
        map.put("data",object);
        return map;
    }
    public static Map<String,Object> success(String msg,Object object){
        Map<String,Object> map = new HashMap();
        map.put("code",ResultCode.GLOBAL_REQUEST_OK.getCode());
        map.put("msg",msg);
        map.put("data",object);
        return map;
    }

    public static Map<String,Object> error(){
        Map<String,Object> map = new HashMap();
        map.put("code",ResultCode.GLOBAL_REQUEST_FAIL.getCode());
        map.put("msg",ResultCode.GLOBAL_REQUEST_FAIL.getMsg());
        return map;
    }
    public static Map<String,Object> error(String msg){
        Map<String,Object> map = new HashMap();
        map.put("code",ResultCode.GLOBAL_REQUEST_FAIL.getCode());
        map.put("msg",msg);
        return map;
    }
    public static Map<String,Object> error(Object object){
        Map<String,Object> map = new HashMap();
        map.put("code",ResultCode.GLOBAL_REQUEST_FAIL.getCode());
        map.put("msg",ResultCode.GLOBAL_REQUEST_FAIL.getMsg());
        map.put("data",object);
        return map;
    }
    public static Map<String,Object> error(String msg,Object object){
        Map<String,Object> map = new HashMap();
        map.put("code",ResultCode.GLOBAL_REQUEST_FAIL.getCode());
        map.put("msg",msg);
        map.put("data",object);
        return map;
    }
    public static Map<String,Object> other(Integer code,String msg){
        Map<String,Object> map = new HashMap();
        map.put("code",code);
        map.put("msg",msg);
        return map;
    }


    public static Map<String,Object> other(ResultCode resultCode,Object obj){
        Map<String,Object> map = new HashMap();
        map.put("code",resultCode.getCode());
        map.put("msg",resultCode.getMsg());
        map.put("data",obj);
        return map;
    }

    public static Map<String,Object> other(ResultCode resultCode){
        Map<String,Object> map = new HashMap();
        map.put("code",resultCode.getCode());
        map.put("msg",resultCode.getMsg());
        return map;
    }

    public static Map<String,Object> other(Integer code,String msg,Object object){
        Map<String,Object> map = new HashMap();
        map.put("code",code);
        map.put("msg",msg);
        map.put("data",object);
        return map;
    }
    public static Map<String,Object> error(int code,String msg){
        Map<String,Object> map = new HashMap();
        map.put("code",code);
        map.put("msg",msg);
        return map;
    }
}
