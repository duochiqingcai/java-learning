package com.dcqc.demo.进阶.Java三大器.过滤器Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: interview
 * @description 声明式注解过滤器配置
 * @author: duochiqingcai
 * @create: 2019-03-13 23:06
 **/
@Configuration
public class MyFilterConfig {
    /**
     * 注册过滤器
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean registFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        filterRegistrationBean.setFilter(new DemoFilter());

        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;
    }
}
