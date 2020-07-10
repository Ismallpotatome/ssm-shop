package com.baidu.longjt.domain.bo;

import com.baidu.longjt.domain.po.Product;
import lombok.Data;

import java.util.Date;

@Data
public class CartsBo {
    /**
     * 购物车主键
     */
    private Integer cartId;

    private Integer memberId;

    /**
     * 商品ID
     */
    private Integer productId;

    /**
     * 购买数量
     */
    private Integer quantity;

    /**
     * 是否删除 1.表示未删除  0 表示删除
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;
    private Product product;
}
