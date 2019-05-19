package com.jack;

import org.apache.ibatis.plugin.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyPageInterceptorConfig {
    @Bean
    public Interceptor getInterceptor() {
        return new MyPageInterceptor();
    }
}
