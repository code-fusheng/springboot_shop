/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UIRepository
 * Author:   25610
 * Date:     2020/2/11 22:18
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.fusheng.springboot_shop.entity.MenuList;

@Repository
public interface UIRepository extends JpaRepository(MenuList, Integer) {
}
