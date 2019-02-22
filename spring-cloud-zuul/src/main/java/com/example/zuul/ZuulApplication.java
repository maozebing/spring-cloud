package com.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 描述 ：
 *
 * @author MZB
 * @version v1.00
 * @date 2019/2/22 10:39
 * @update : 修改人，修改时间，修改内容
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

}
