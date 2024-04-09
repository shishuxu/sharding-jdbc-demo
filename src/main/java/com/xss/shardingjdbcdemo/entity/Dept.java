package com.xss.shardingjdbcdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * 测试分表中间件实体类
 * @Date 23/0407
 * @author xss
 * @version 1.0
 */
@TableName("dept")
@Data
@ToString
public class Dept{

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private String salary;

    private String city;
}
