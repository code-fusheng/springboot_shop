/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserRepository
 * Author:   25610
 * Date:     2020/2/11 16:16
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.fusheng.springboot_shop.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
