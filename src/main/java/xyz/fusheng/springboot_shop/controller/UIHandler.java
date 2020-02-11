/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UIHandler
 * Author:   25610
 * Date:     2020/2/11 22:19
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.fusheng.springboot_shop.entity.MenuList;
import xyz.fusheng.springboot_shop.repository.UIRepository;

import java.util.List;

@RestController
@RequestMapping("/ui")
public class UIHandler {

    @Autowired
    private UIRepository uiRepository;


    public List<MenuList> findAll(){
        return uiRepository.findAll();
    };


}
