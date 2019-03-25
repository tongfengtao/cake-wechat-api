package com.system.cakedemo.banner.server.impl;

import com.system.cakedemo.banner.mapper.BannerMapper;
import com.system.cakedemo.banner.server.BannerServer;
import com.system.cakedemo.utils.ResMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BannerServerImpl implements BannerServer {
    @Autowired
    private BannerMapper bannerMapper;
    @Override
    public Map bannerList() {
        return ResMsg.success(bannerMapper.bannerList());
    }
}
