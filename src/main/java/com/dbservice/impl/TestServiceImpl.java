package com.dbservice.impl;

import com.dbservice.BaseService;
import com.dbservice.TestService;
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
}
