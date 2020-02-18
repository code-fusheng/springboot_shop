/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: RoleHandler
 * Author:   25610
 * Date:     2020/2/17 13:45
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.fusheng.springboot_shop.entity.Role;
import xyz.fusheng.springboot_shop.entity.User;
import xyz.fusheng.springboot_shop.repository.RoleRepository;
import xyz.fusheng.springboot_shop.service.RoleService;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleHandler {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private RoleService roleService;

    @GetMapping("/roles")
    public List<Role> findAll(){
        return roleService.buildRolesList();
    }

    @GetMapping("/roles/findById/{id}")
    public Role findById(@PathVariable("id") Integer id){
        return roleRepository.findById(id).get();
    }


    @PostMapping("/roles/save")
    public String save(@RequestBody Role role){
        Role result = roleRepository.save(role);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @PutMapping("/roles/edit")
    public String update(@RequestBody Role role) {
        Role result = roleRepository.save(role);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @DeleteMapping("/roles/deleteById/{id}")
    public void deleteByID(@PathVariable("id") Integer id) {
        roleRepository.deleteById(id);
    }
}
