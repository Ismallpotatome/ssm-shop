package com.baidu.longjt.service.impl;

import com.baidu.longjt.domain.bo.CartsBo;
import com.baidu.longjt.mapper.CartsMapper;
import com.baidu.longjt.service.CartsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CartsServiceImpl implements CartsService {
    @Resource
    CartsMapper cartsMapper;
    @Override
    public List<CartsBo> showAllCarts() {
        List<CartsBo> cartsBos = cartsMapper.selectAllCarts();
        return cartsBos;
    }
}
