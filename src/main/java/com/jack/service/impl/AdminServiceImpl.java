package com.jack.service.impl;

import com.jack.bean.Admin;
import com.jack.mapper.AdminMapper;
import com.jack.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    //这里的单引号不能少，否则会报错，被识别是一个对象
    private static final String CACHE_KEY = "'user'";
    private static final String DEMO_CACHE_NAME = "users";

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void updateLastLoginTime(Admin admin) {
        adminMapper.updateByPrimaryKey(admin);
    }

    @Override
    @Cacheable(value=DEMO_CACHE_NAME,key="'user_'+#uuid")
    public Admin select(int id) {
        Admin admin = adminMapper.selectByPrimaryKey(id);
        return admin;
    }
}
