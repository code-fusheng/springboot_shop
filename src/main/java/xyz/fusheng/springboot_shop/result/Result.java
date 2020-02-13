/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Result
 * Author:   25610
 * Date:     2020/2/12 15:05
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.result;

import lombok.Data;

import java.util.HashMap;

@Data
public class Result {

    private Object data;
    private HashMap<String, Object> meta = new HashMap<>();

    public Result(Object data, String msg, Integer status) {
        meta.put("msg",msg);
        meta.put("status",status);
        this.data = data;
    }

}
