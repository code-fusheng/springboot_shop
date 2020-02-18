/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: MenuHandler
 * Author:   25610
 * Date:     2020/2/12 12:56
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.fusheng.springboot_shop.entity.Menu;
import xyz.fusheng.springboot_shop.repository.MenuRepository;
import xyz.fusheng.springboot_shop.service.MenuService;
import xyz.fusheng.springboot_shop.service.impl.MenuServiceImpl;


import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private MenuService menuService;


    @GetMapping("/menus")
    public List<Menu> menuList(){
        return menuService.buildMenuList();
    }

    @GetMapping("/menus/findAll")
    public List<Menu> findAll(){
        return menuRepository.findAll();
    }

}
