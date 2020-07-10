package com.baidu.longjt.controller;

import com.baidu.longjt.domain.bo.CartsBo;
import com.baidu.longjt.service.CartsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CartsController {
    @Resource(name = "cartsServiceImpl")
    CartsService cartsService;
    @RequestMapping("/show")
    public List<CartsBo> showAllCats(){
        List<CartsBo> cartsBos = cartsService.showAllCarts();
        return cartsBos;
    }
}
