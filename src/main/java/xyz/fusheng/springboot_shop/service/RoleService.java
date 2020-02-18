/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: RoleService
 * Author:   25610
 * Date:     2020/2/17 13:42
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.service;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.fusheng.springboot_shop.entity.Role;

import java.util.List;

public interface RoleService{

    List<Role> buildRoleList();
}
