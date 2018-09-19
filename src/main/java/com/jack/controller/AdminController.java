package com.jack.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jack.bean.Admin;
import com.jack.bean.AdminExample;
import com.jack.common.RequestStatus;
import com.jack.common.Result;
import com.jack.mapper.AdminMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/unsafe")
public class AdminController {

    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private AdminMapper adminMapper;

    @RequestMapping("/login")
    public Result login(@RequestBody String body){
//    public Result login(String adminName, String password){
        JSONObject json = JSON.parseObject(body);
        String adminName = json.getString("adminName");
        String password = json.getString("password");
        logger.info("账号:"+adminName+",密码:"+password);
        if(adminName == null || password == null){
            return Result.build(RequestStatus.ERROR,"账号密码不能为空");
        }
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminnameEqualTo(adminName);
        criteria.andPasswordEqualTo(password);
        List<Admin> adminList = adminMapper.selectByExample(adminExample);
        if(adminList.size()< 1){
            return Result.build(RequestStatus.FILED,"账号或密码不正确");
        }
        String token = UUID.randomUUID().toString();
        JSONObject tokenJs = new JSONObject();
        tokenJs.put("token",token);
        return Result.ok(tokenJs);
    }

}
