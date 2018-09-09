package com.druid;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class DruidConfiguration {

    @Bean
    public ServletRegistrationBean statViewServlet() {
            ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        // IP 白名单
        servletRegistrationBean.addInitParameter("allow", "192.168.67.1");
        // IP 黑名单
//        servletRegistrationBean.addInitParameter("deny","");
        // 控制台用户
        servletRegistrationBean.addInitParameter("loginUsername", "admin");
        servletRegistrationBean.addInitParameter("loginPassword", "123456");
        // 是否能够重置数据
        System.out.print("走了");
        System.out.print("走了");
        System.out.print("走了");
        System.out.print("走了");
        System.out.print("走了");
        System.out.print("走了");
        System.out.print("走了");
        System.out.print("走了");
        servletRegistrationBean.addInitParameter("resetEnabled", "false");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean statFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
