package com.system.cakedemo.product.controller;

import com.system.cakedemo.product.server.ProductServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductServer productServer;
    @RequestMapping(value = "list")
    public Map productList(@RequestParam Map map){
        return productServer.productList();
    }
    @RequestMapping(value = "good/list")
    public Map goodProductList(){
        return productServer.goodProductList();
    }
    @RequestMapping(value = "details")
    public Map productDetails(@RequestParam String id){
        return productServer.productDetails(id);
    }
}
