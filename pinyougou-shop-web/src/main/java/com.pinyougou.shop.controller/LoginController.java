package com.pinyougou.shop.controller;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: java类作用描述
 * @Author: wangy
 * @CreateDate: 2020/8/2/002 15:16
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("name")
    public Map name(HttpSession session){
        SecurityContextImpl securityContext = (SecurityContextImpl) session.getAttribute("SPRING_SECURITY_CONTEXT");
        String name = ((UserDetails)securityContext.getAuthentication().getPrincipal()).getUsername();

        Map map = new HashMap();
        map.put("loginName", name);
        return map ;
    }

}
