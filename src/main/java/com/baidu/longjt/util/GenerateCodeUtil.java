package com.baidu.longjt.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateCodeUtil {

    /**
     * 生成订单号
     */
    // 用于生成订单标示，自增
    public static int index = 100;
    public static synchronized String createCodeNum(String pre) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYMMddHHmmss");
        String orderNum = pre + dateFormat.format(new Date());
        orderNum += index++;
        if (index > 999){
            index = 100;
        }
        return orderNum;
    }
}