package com.baidu.longjt.controller;

import com.baidu.longjt.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    OrderService orderService;
    @RequestMapping("/clear")
    public String clearCarts(int memberId){
        String s = orderService.buyAllCarts(memberId);
        return s;
    }
}
