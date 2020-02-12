/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: MenuList
 * Author:   25610
 * Date:     2020/2/11 22:16
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "sys_menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer menu_id;
    private String menu_name;
    private int menu_parent_id;
    private int menu_level;
    private String menu_controller;
    private String menu_local;
}
