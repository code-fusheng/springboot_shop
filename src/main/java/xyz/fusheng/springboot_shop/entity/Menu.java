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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "sys_menu")
// @JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(columnDefinition="INT default 0")
    private int pid;        // 父类Id
    @Column(columnDefinition="INT default 0")
    private int level;      // 权限等级
    private String path;    // 路由
    private String icon;    // iconfont 图标


    @Transient
    private List<Menu> children;
}
