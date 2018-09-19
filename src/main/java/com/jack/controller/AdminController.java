package com.jack.controller;

import com.jack.common.Result;
import com.jack.mapper.AdminMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/unsafe")
public class AdminController {

    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private AdminMapper adminMapper;

    @RequestMapping("/login")
    public Result login(String adminName, String password){
        logger.info("账号:"+adminName+",密码:"+password);
        return Result.ok();
    }

}
