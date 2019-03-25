package com.system.cakedemo.order.server.impl;

import com.system.cakedemo.order.mapper.OrderMapper;
import com.system.cakedemo.order.server.OrderServer;
import com.system.cakedemo.utils.ResMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderServerImpl implements OrderServer {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Map saveorder(Map map) {
        return ResMsg.success(orderMapper.saveorder(map));
    }
}
