/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: ResultFactory
 * Author:   25610
 * Date:     2020/2/12 15:10
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.result;

public class ResultFactory {
    public  static Result buildSuccessResult(Object data,String message){
        return buildResult(data,message,StatusCode.SUCCESS.code);
    }
    public static Result buildFailResult(String message) {
        return buildResult(null,message,StatusCode.FAIL.code);
    }

    public static Result buildResult(Object data, String message,Integer resultCode) {
        return new Result(data, message, resultCode);
    }
}
