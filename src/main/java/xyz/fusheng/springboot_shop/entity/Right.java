/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Right
 * Author:   25610
 * Date:     2020/2/17 12:56
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "sys_right")
public class Right {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(columnDefinition="INT default 0")
    private int pid;
    @Column(columnDefinition="INT default 0")
    private int level;

    @Transient
    private List<Right> children;
}
