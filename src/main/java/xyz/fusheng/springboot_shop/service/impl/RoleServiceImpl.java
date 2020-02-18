/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: RoleServiceImpl
 * Author:   25610
 * Date:     2020/2/17 13:43
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fusheng.springboot_shop.entity.Menu;
import xyz.fusheng.springboot_shop.entity.Right;
import xyz.fusheng.springboot_shop.entity.Role;
import xyz.fusheng.springboot_shop.repository.RightRepository;
import xyz.fusheng.springboot_shop.repository.RoleRepository;
import xyz.fusheng.springboot_shop.service.RightService;
import xyz.fusheng.springboot_shop.service.RoleService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private RightService rightService;



    @Override
    public List<Role> buildRolesList() {
        List<Role> roles = roleRepository.findAll();
        List<Right> rights = rightService.buildRightList();
        for (Role role : roles) {
            role.setChildren(rights);
        }
        return roles;
    }
}
