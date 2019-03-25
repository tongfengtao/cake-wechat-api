package com.system.cakedemo.product.mapper;

import java.util.List;
import java.util.Map;


public interface ProductMapper {
    List<Map> productList();
    List<Map> goodProductList();
    public Map productDetails(String product_id);
}
