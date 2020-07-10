package com.baidu.longjt.domain.po;

import lombok.Data;

@Data
public class ShopOrderItem {
    /**
    * 主键
    */
    private Integer orderItemId;

    /**
    * 订单号
    */
    private Integer orderId;

    /**
    * 商品图片
    */
    private Integer productId;

    /**
    * 购买的数量
    */
    private Integer productQuantity;

    /**
    * 状态
    */
    private Integer status;
}