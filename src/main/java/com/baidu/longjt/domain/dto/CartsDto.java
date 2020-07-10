package com.baidu.longjt.domain.dto;

import com.baidu.longjt.domain.po.Product;
import lombok.Data;

@Data
public class CartsDto {
    private Integer cartId;
    /**
     * 购买数量
     */
    private Integer quantity;
    /**
     * 商品ID
     */
    private Integer productId;

    private Product product;
}
