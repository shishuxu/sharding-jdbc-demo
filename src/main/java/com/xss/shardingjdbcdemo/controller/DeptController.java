package com.xss.shardingjdbcdemo.controller;

import com.xss.shardingjdbcdemo.entity.Dept;
import com.xss.shardingjdbcdemo.entity.DeptDetail;
import com.xss.shardingjdbcdemo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dept")
public class DeptController {


    @Autowired
    private DeptService deptService;
    @RequestMapping("/save")
    public String saveDept(){
        deptService.saveDept();
        return "Save Successfully!";
    }

    @RequestMapping("/getList")
    public String getList(){
        deptService.getList();
        return "Save Successfully!";
    }
}

