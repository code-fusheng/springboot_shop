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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
}
