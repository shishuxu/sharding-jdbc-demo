package com.xss.shardingjdbcdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xss.shardingjdbcdemo.entity.DeptDetail;
import org.springframework.stereotype.Repository;
/**
 * 测试分表中间件实体类
 * @Date 23/0407
 * @author xss
 * @version 1.0
 */
@Repository
public interface DeptDetailMapper extends BaseMapper<DeptDetail> {
}