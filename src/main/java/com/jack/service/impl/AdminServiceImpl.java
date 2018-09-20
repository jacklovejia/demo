package com.jack.service.impl;

import com.jack.bean.Admin;
import com.jack.mapper.AdminMapper;
import com.jack.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void updateLastLoginTime(Admin admin) {
        adminMapper.updateByPrimaryKey(admin);
    }
}
