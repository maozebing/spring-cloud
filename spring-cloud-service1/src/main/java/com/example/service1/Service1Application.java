package com.example.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述 ：
 *
 * @author MZB
 * @version v1.00
 * @date 2019/2/22 9:46
 * @update : 修改人，修改时间，修改内容
 */
@SpringBootApplication
//@EnableEurekaClient
public class Service1Application {

    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
    }

}
