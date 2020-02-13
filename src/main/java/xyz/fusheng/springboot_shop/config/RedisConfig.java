/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Redisconfig
 * Author:   25610
 * Date:     2020/2/12 15:19
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_shop.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@EnableCaching  //开启注解
public class RedisConfig {

}
