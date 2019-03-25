package com.system.cakedemo.banner.controller;

import com.system.cakedemo.banner.server.BannerServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/banner")
public class BannerController {

    @Autowired
    private BannerServer bannerServer;
    @RequestMapping(value = "list")
    public Map bannerList(){
        return bannerServer.bannerList();
    }
}
