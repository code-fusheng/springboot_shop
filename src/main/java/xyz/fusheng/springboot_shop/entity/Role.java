/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Role
 * Author:   25610
 * Date:     2020/2/17 12:41
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import xyz.fusheng.springboot_shop.entity.Right;

@Data
@Entity
@Table(name = "sys_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;       // 角色名
    @Column(name = "r_desc")
    private String desc;       // 角色描述
    private String rid;        // 权限id

    @Transient
    private List<Right> children;
}
