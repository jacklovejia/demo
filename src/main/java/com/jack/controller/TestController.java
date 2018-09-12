package com.jack.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.jack.bean.Test;
import com.jack.dbservice.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试
 */
@RestController("testController")
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping("/testPage")
    public JSONObject testPage() {
        int current = 1;
        int size = 4;
        JSONObject json = new JSONObject();
        Wrapper<Test> tWrapper = new EntityWrapper<>();
//        List<Test> tests = testService.selectList(tWrapper);
        Page<Test> testPage = testService.selectPage(new Page<>(current, size), tWrapper);
        json.put("data",testPage);
        return json;
    }
}
