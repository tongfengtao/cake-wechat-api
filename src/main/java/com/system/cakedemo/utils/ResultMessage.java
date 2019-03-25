package com.system.cakedemo.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/3.
 */
public class ResultMessage {
    /**
     * Message map.
     *
     * @param code the code
     * @param msg  the msg
     * @return the map
     */
    public static Map message(int code ,String msg ){
        Map map = new HashMap();
        map.put("code",code);
        map.put("msg",msg);
        return map;
    }

    /**
     * Message map.
     *
     * @param code the code
     * @param msg  the msg
     * @param body the body
     * @return the map
     */
    public static Map message(int code,String msg , Object body){
        Map map = new HashMap();
        map.put("code",code);
        map.put("msg",msg);
        map.put("body",body);
        return map;
    }

    public static Map success(Object body){
        Map map = new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("body",body);
        return map;
    }

    public static Map success(){
        Map map = new HashMap();
        map.put("code",0);
        map.put("msg","");
        return map;
    }
    public static Map error(String msg){
        Map map = new HashMap();
        map.put("code",-1);
        map.put("msg",msg);
        return map;
    }

}
