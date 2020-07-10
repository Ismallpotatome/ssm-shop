package com.baidu.longjt.mapper;

import com.baidu.longjt.domain.po.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
    int updateStockById(@Param("pid") int productId, @Param("stock") int stock);
}