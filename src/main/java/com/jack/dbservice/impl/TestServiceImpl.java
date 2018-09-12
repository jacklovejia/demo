package com.jack.dbservice.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jack.bean.Test;
import com.jack.dbservice.TestService;
import com.jack.mapper.TestMapper;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {


}
