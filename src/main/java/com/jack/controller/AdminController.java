package com.jack.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jack.bean.Admin;
import com.jack.bean.AdminExample;
import com.jack.bean.CmsApi;
import com.jack.bean.CmsApiExample;
import com.jack.common.Json;
import com.jack.common.Result;
import com.jack.mapper.AdminMapper;
import com.jack.mapper.CmsApiMapper;
import com.jack.service.AdminService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/unsafe")
public class AdminController {

    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private AdminService adminService;
    @Autowired
    private CmsApiMapper cmsApiMapper;

    @RequestMapping("/adminList")
    public Result adminList(@RequestBody String body){
        JSONObject json = JSON.parseObject(body);
//        int current = json.getIntValue("current");
//        int size = json.getIntValue("size");
//        if (current == 0)
//            current = 1;
//        if (size == 0)
//            size = 10;
        AdminExample adminExample = new AdminExample();
        PageHelper.startPage(1, 4);
        List<Admin> adminList = adminMapper.selectByExample(adminExample);
        logger.info("查到数据:"+adminList);
        PageInfo<Admin> p = new PageInfo<>(adminList);
//        CmsApiExample example = new CmsApiExample();
//        PageHelper.startPage(1, 4);
//        List<CmsApi> list = cmsApiMapper.selectByExample(example);
//        PageInfo<CmsApi> p = new PageInfo<>(list);
        return  Result.ok(p);
//        return Json.succ().data("page", p);
    }


    @RequestMapping("/login")
    public Result login(@RequestBody String body) {
//    public Result login(String adminName, String password){
        JSONObject json = JSON.parseObject(body);
        String adminName = json.getString("adminName");
        String password = json.getString("password");
        logger.info("账号:" + adminName + ",密码:" + password);

        UsernamePasswordToken token = new UsernamePasswordToken(adminName, password);
        Subject currentUser = SecurityUtils.getSubject();
        try {
            currentUser.login(token);
        } catch (IncorrectCredentialsException ice) {
            logger.info("对用户【" + adminName + "】进行登录验证，验证未通过，错误的凭证！");
            return Result.build(250, "用户名或密码不正确！");
        } catch (UnknownAccountException uae) {
            logger.info("对用户【" + adminName + "】进行登录验证，验证未通过，未知账户！");
            return Result.build(250, "未知账户！");
        } catch (LockedAccountException lae) {
            logger.info("对用户【" + adminName + "】进行登录验证，验证未通过，账户锁定！");
            return Result.build(250, "账户已锁定！");
        } catch (ExcessiveAttemptsException eae) {
            logger.info("对用户【" + adminName + "】进行登录验证，验证未通过，错误次数太多！");
            return Result.build(250, "用户名或密码错误次数太多！");
        } catch (AuthenticationException ae) {
            logger.info("对用户【" + adminName + "】进行登录验证，验证未通过，堆栈轨迹如下：！");
            ae.printStackTrace();
            return Result.build(250, "用户名或密码不正确！");
        }
        String ServerToken = UUID.randomUUID().toString();
        JSONObject tokenJs = new JSONObject();
        tokenJs.put("token",ServerToken);

        return Result.ok(tokenJs);
    }

}
