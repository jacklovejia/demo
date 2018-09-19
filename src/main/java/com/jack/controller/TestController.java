package com.jack.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jack.bean.CmsApi;
import com.jack.bean.CmsApiExample;
import com.jack.common.Result;
import com.jack.mapper.CmsApiMapper;
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
    private CmsApiMapper cmsApiMapper;

    @RequestMapping("/testPage")
    public Result test() {
        CmsApiExample example = new CmsApiExample();
//        CmsApiExample.Criteria criteria = example.createCriteria(); // 创建查询条件
//        criteria.andApiNameEqualTo("11");

        PageHelper.startPage(1, 4);
        List<CmsApi> list = cmsApiMapper.selectByExample(example);
        PageInfo<CmsApi> p = new PageInfo<>(list);
        return  Result.ok(p);
    }


}
