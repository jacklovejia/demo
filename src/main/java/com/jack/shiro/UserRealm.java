package com.jack.shiro;


import com.jack.bean.Admin;
import com.jack.bean.AdminExample;
import com.jack.mapper.AdminMapper;
import com.jack.service.AdminService;
import com.jack.utils.DateUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * 这个类是参照JDBCRealm写的，主要是自定义了如何查询用户信息，如何查询用户的角色和权限，如何校验密码等逻辑
 */
public class UserRealm extends AuthorizingRealm {

    private static final Logger log = LoggerFactory.getLogger(UserRealm.class);

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminService adminService;

    @Override
    public void setCredentialsMatcher(CredentialsMatcher credentialsMatcher) {
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("md5");//使用MD5散列算法
        hashedCredentialsMatcher.setHashIterations(1);//散列次数，这里等于1次MD5
        log.info("设置密码加密那块代码执行了=====================");
        hashedCredentialsMatcher.setStoredCredentialsHexEncoded(true);  //散列后密码为16进制，要与生成密码时一致。false 表示Base64编码
        super.setCredentialsMatcher(hashedCredentialsMatcher);
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String currentUserName = (String) principals.getPrimaryPrincipal();
        List<String> roles = new ArrayList<String>();  //角色
        List<String> prems = new ArrayList<String>(); //权限
        roles.add("baidu");
        roles.add("google");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addRoles(roles);
        authorizationInfo.addStringPermissions(prems);
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//        SecurityUtils.getSubject().getSession().getId().AuthenticationInfo.class);
        String userName = (String) token.getPrincipal();
        //为了测试通过，这里暂时写死， user： admin password： 123456
        // UserVo user = loginClient.selectUserByName(userName);
        log.info("userRealm中用户名是:"+userName);

//        try {
//            System.out.print("adminMapper:"+adminMapper == null);
//            AdminExample adminExample = new AdminExample();
//            AdminExample.Criteria criteria = adminExample.createCriteria();
//            criteria.andAdminnameEqualTo(userName);
//
//            List<Admin> adminList = adminMapper.selectByExample(adminExample);
//        }catch (Exception e){
//            log.info("我打印的信息",e);
//        }
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAdminnameEqualTo(userName);
        List<Admin> adminList = adminMapper.selectByExample(example);
        log.info("list.size():"+adminList.size());

        if (adminList.size() < 1) {
            throw new UnknownAccountException();//没找到帐号
        }
        Admin admin = adminList.get(0);
        // 更新最后登录时间
        admin.setLastlogintime(DateUtil.getFormatDate2());
        adminService.updateLastLoginTime(admin);
        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                userName, //用户名
                admin.getPassword(), //密码
                getName()  //realm name
        );
        return authenticationInfo;

    }


}
