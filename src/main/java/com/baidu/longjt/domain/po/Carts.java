package com.baidu.longjt.domain.po;

import java.util.Date;
import lombok.Data;

/**
    * 购物车表
    */
@Data
public class Carts {
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
}