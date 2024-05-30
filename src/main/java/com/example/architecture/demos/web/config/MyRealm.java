package com.example.architecture.demos.web.config;

import com.example.architecture.demos.web.entity.User;
import com.example.architecture.demos.web.mapper.UserDao;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

public class MyRealm extends AuthorizingRealm {
    @Resource
    private UserDao userDao;

    /**
     * 获取授权数据(角色权限信息)
     * 因不设权限，暂不考虑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 获取认证的安全数据（从数据库查询到的用户正确数据）
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //参数authenticationToken就是传递的 subject.login(token)
        UsernamePasswordToken token= (UsernamePasswordToken) authenticationToken;
        //从token中获取用户名
        String username = token.getUsername();
        //根据用户名从数据库查询用户安全数据
        User user = userDao.getUserByUsername(username);

        AuthenticationInfo info=new SimpleAuthenticationInfo(username,user.getUserPasswd(),getName());
        return info;
    }
}
