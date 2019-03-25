package com.system.cakedemo.order.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


public interface OrderMapper {
    List<Map> orderList();
    public Integer saveorder(Map map);
}
