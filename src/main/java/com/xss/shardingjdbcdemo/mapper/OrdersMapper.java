package com.xss.shardingjdbcdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xss.shardingjdbcdemo.entity.Orders;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Date 23/0407
 * @author xss
 * @version 1.0
 */
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {

    @Select("select * from orders where order_type>4")
    List<Orders> get();

}
