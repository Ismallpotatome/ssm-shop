package com.baidu.longjt.domain.po;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import lombok.Data;

@Data
public class ShopOrder {
    /**
    * 订单id
    */
    private BigInteger orderId;

    /**
    * 订单号
    */
    private String orderNum;

    /**
    * 会员id
    */
    private BigInteger memberId;

    /**
    * 提交时间
    */
    private Date createTime;

    /**
    * 订单状态
    */
    private Integer status;

    /**
    * 订单总金额
    */
    private BigDecimal totalAmount;
}