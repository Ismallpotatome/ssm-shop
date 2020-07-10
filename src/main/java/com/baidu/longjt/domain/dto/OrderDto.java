package com.baidu.longjt.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Data
@Component
public class OrderDto {
    private Integer memberId;

    private String memberNum;
    /**
     * 订单总金额
     */
    private BigDecimal totalAmount;
    /**
     * 一个订单对应多个购物车商品
     */
    private List<CartsDto> cartsDtos;
}
