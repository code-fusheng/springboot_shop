/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserHandler
 * Author:   25610
 * Date:     2020/2/11 16:16
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import xyz.fusheng.springboot_shop.entity.User;
import xyz.fusheng.springboot_shop.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login/{username}/{password}")
    public Boolean login(@PathVariable("username") String username, @PathVariable("password") String password){
        Iterable<User> users = userRepository.findAll();
        for(User u : users){
            if (u.getUsername().equals(username)&&u.getPassword().equals(password)){
                System.out.println("输出用户操作日志:"+username+"登录成功");
                return true;
            }
        }
        return false;
    }

}
