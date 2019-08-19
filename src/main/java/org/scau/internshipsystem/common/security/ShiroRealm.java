package org.scau.internshipsystem.common.security;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.scau.internshipsystem.system.entity.User;
import org.scau.internshipsystem.system.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Slf4j
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    UserServiceImpl userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        List<String> menuCodes = userService.getMenuCodeByUserId(user.getId());
        Set<String> pemissionSet=new HashSet<>();
        pemissionSet.addAll(menuCodes);
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        authorizationInfo.setStringPermissions(pemissionSet);
        return authorizationInfo;
    }


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = ((UsernamePasswordToken) authenticationToken).getUsername();
        User user = userService.getUserByUsername(username);
        if(user == null)
            return null;
        return new SimpleAuthenticationInfo(user, user.getPassword(),"");
    }
}
