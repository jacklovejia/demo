package com.dbservice.impl;

import com.dbservice.TestService;
import com.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Map<String, String>> getList() {
        return testMapper.getList();
    }
}
