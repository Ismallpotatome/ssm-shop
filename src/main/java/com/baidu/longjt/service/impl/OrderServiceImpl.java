package com.baidu.longjt.service.impl;

import com.baidu.longjt.domain.dto.CartsDto;
import com.baidu.longjt.domain.dto.OrderDto;
import com.baidu.longjt.mapper.CartsMapper;
import com.baidu.longjt.mapper.ProductMapper;
import com.baidu.longjt.mapper.ShopOrderItemMapper;
import com.baidu.longjt.mapper.ShopOrderMapper;
import com.baidu.longjt.service.OrderService;
import com.baidu.longjt.util.GenerateCodeUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    CartsMapper cartsMapper;
    @Resource
    ProductMapper productMapper;
    @Resource
    ShopOrderMapper shopOrderMapper;
    @Resource
    ShopOrderItemMapper shopOrderItemMapper;
    @Resource
    OrderDto orderDto;
    @Transactional
    @Override
    public String buyAllCarts(int memberId) {

        orderDto.setMemberId(memberId);
        /**
         * 生成随机订单号
         */
        String num = GenerateCodeUtil.createCodeNum("L");
        orderDto.setMemberNum(num);
        /**
         * 通过用户ID查询购物车的商品
         */
        orderDto.setTotalAmount(new BigDecimal("0"));
        List<CartsDto> cartsDtos = cartsMapper.selectById(memberId);
        for (CartsDto cartsDto : cartsDtos) {
            /**
             * 减库存，更新数据库
             */
            cartsDto.getProduct().setStock(cartsDto.getProduct().getStock()-cartsDto.getQuantity());
            productMapper.updateStockById(cartsDto.getProductId(),cartsDto.getProduct().getStock());


        }
        orderDto.setCartsDtos(cartsDtos);
        /**
         *
         */

        return null;
    }
}
