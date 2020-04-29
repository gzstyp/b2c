package com.codingstudy.b2c.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-04-29 16:19
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
 */
@RestController
@RequestMapping("api")
public class ApiController{

    @GetMapping("/authority")
    @PreAuthorize("hasAuthority('list')")//权限不区分大小写也以一定是以的ROLE_开头
    public String authority(){
        return "有list权限";
    }

    @GetMapping("/role")
    @PreAuthorize("hasRole('ROLE_ADMIN')")//权限不区分大小写也以一定是以的ROLE_开头
    public String role(){
        return "有ROLE_ADMIN角色";
    }

    @PostMapping("/register")
    public String register(){
        return "api/注册register";
    }
}