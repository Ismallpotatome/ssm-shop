package com.baidu.longjt.mapper;

import com.baidu.longjt.domain.bo.CartsBo;
import com.baidu.longjt.domain.dto.CartsDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CartsMapper {
    List<CartsBo> selectAllCarts();
    List<CartsDto> selectById(@Param("member") int member);
}