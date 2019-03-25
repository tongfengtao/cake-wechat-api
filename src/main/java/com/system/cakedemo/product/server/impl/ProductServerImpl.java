package com.system.cakedemo.product.server.impl;

import com.system.cakedemo.product.mapper.ProductMapper;
import com.system.cakedemo.product.server.ProductServer;
import com.system.cakedemo.utils.ResMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProductServerImpl implements ProductServer {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Map goodProductList() {
        return ResMsg.success(productMapper.goodProductList());
    }

    @Override
    public Map productDetails(String id) {
        return ResMsg.success(productMapper.productDetails(id));
    }

    @Override
    public Map productList() {
        return ResMsg.success(productMapper.productList());
    }
}
