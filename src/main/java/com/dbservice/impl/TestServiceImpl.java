package com.dbservice.impl;

import com.alibaba.fastjson.JSONObject;
import com.dbservice.BaseService;
import com.dbservice.TestService;
import com.github.pagehelper.PageHelper;
import com.mapper.TestMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("testService")
public class TestServiceImpl extends BaseService implements TestService {

    @Override
    public List<Map<String, String>> getList() {
        TestMapper bean = this.applicationContext.getBean(TestMapper.class);
        return bean.getList();
    }

    @Override
    public JSONObject getListPage(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return null;
    }
}
