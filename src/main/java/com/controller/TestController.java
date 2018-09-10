package com.controller;

import com.dbservice.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 *  测试
 */
@RestController("testController")
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/testDB")
    public String testDB(){
        List<Map<String, String>> list = testService.getList();
        System.out.print(list);
        return list.toString();
    }
}
