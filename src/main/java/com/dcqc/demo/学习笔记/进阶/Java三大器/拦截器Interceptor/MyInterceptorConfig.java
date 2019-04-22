package com.dcqc.demo.学习笔记.进阶.Java三大器.拦截器Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: interview
 * @description 配置拦截器，通过实现WebMvcConfigurer接口完成；
 * 注：有些教程是通过实现WebMvcConfigurerAdapter类完成，诞生WebMvcConfigurerAdapter在Spring5.0已经被废弃不使用
 * @author: duochiqingcai
 * @create: 2019-03-14 00:15
 **/
@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer {
    /**
     * 注册拦截器到Spring
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new DemoInterceptor());
    }
}
