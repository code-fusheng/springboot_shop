/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: User
 * Author:   25610
 * Date:     2020/2/11 16:08
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "sys_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;        // 真实姓名
    private String username;    // 用户名
    private String password;    // 用户密码
    private Integer age;        // 年龄
    private String sex;         // 性别
    private String mobile;      // 手机号
    private String qq;          // QQ号码
    private String email;       // 邮箱
    private Date createTime;    // 创建时间
    private Date updateTime;    // 修改时间
    private String role;        // 权限
    private Boolean active; //  1 激活状态 or 0 非激活
}
