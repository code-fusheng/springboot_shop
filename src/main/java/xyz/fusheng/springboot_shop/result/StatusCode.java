/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: StatusCode
 * Author:   25610
 * Date:     2020/2/12 15:07
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.result;

public enum StatusCode {
    SUCCESS(200),
    FAIL(400);
    public int code;

    StatusCode(int code) {
        this.code = code;
    }
}
