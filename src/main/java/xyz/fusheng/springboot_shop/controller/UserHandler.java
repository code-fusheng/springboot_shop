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
import xyz.fusheng.springboot_shop.utils.EntityUtils;

import java.util.List;

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

    @GetMapping("/users/{page}/{size}")
    public Page<User> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageRequest request1 = PageRequest.of(page, size);
        return userRepository.findAll(request1);
    }

    @PutMapping("/users/update")
    public String updateActive(@RequestBody User user) {
        User result = userRepository.save(user);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @GetMapping("/users/query/{key}")
    public List queryUser(@PathVariable("key") String key){
        List<User> list =  userRepository.findAllByKey(key);
        return list;
    }

    @PostMapping("/users/save")
    public String save(@RequestBody User user) {
        User result = userRepository.save(user);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @GetMapping("/users/findById/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userRepository.findById(id).get();
    }

    @PutMapping("/users/edit ")
    public String update(@RequestBody User user) {
        User result = userRepository.save(user);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @DeleteMapping("/users/deleteById/{id}")
    public void deleteByID(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }

    /*-----------------------------------------------------------------------*/

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userRepository.findAll();
    }
}
