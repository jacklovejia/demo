package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.jack.mapper")
@EnableTransactionManagement
@EnableScheduling

/**
* @Description:    类作用描述
* @Author:         Jack
* @CreateDate:     2019/5/13 15:15
* @UpdateUser:     Jack
* @UpdateDate:     2019/5/13 15:15
* @UpdateRemark:   修改内容
* @Version:        1.0
*/

public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
