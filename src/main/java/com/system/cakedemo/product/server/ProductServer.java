package com.system.cakedemo.product.server;

import java.util.Map;

public interface ProductServer {
    public Map productList();
    public Map goodProductList();
    public Map productDetails(String id);
}
