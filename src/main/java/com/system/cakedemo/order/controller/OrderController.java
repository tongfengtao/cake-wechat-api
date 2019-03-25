package com.system.cakedemo.order.controller;

import com.system.cakedemo.order.mapper.OrderMapper;
import com.system.cakedemo.order.server.OrderServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderServer orderServer;

    @RequestMapping(value = "save")
    public Map saveorder(@RequestParam Map map){
        return orderServer.saveorder(map);
    }
}
