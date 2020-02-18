/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: RoleRepository
 * Author:   25610
 * Date:     2020/2/17 13:44
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.fusheng.springboot_shop.entity.Role;
import xyz.fusheng.springboot_shop.entity.User;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    @Override
    List<Role> findAll();
}
