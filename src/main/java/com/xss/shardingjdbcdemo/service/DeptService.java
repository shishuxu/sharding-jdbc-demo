package com.xss.shardingjdbcdemo.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xss.shardingjdbcdemo.entity.Dept;
import com.xss.shardingjdbcdemo.entity.DeptDetail;
import com.xss.shardingjdbcdemo.mapper.DeptDetailMapper;
import com.xss.shardingjdbcdemo.mapper.DeptMapper;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DeptService  {
    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private DeptDetailMapper deptDetailMapper;

    @Transactional
    @ShardingTransactionType(TransactionType.XA)
    public void saveDept() {
        for(int i=0;i<6;i++){
            Dept dept = new Dept();
            dept.setName("Java高级工程师" + i);
            dept.setSalary("40K");
            dept.setCity("北京");
            deptMapper.insert(dept);
            // 注意 : 模拟出现 BUG -> 然后去数据库中验证数据是否插入！
            if(i == 4){
//                throw new RuntimeException("模拟出现 BUG -> 然后去数据库中验证数据是否插入！");
            }
            DeptDetail deptDetail = new DeptDetail();
            deptDetail.setPid(dept.getId());
            deptDetail.setDescription("高级工程师描述" + i);
            deptDetailMapper.insert(deptDetail);
        }
    }


    public void getList(){
        List<Dept> list = deptMapper.selectList(null);
        List<DeptDetail> deptDetails = deptDetailMapper.selectList(null);
        System.out.println(new Gson().toJson(list));
        System.out.println(new Gson().toJson(deptDetails));

    }

}
