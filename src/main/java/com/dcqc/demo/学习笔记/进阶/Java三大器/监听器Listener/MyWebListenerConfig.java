package com.dcqc.demo.学习笔记.进阶.Java三大器.监听器Listener;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: interview
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-13 15:59
 **/
@Configuration
public class MyWebListenerConfig implements WebMvcConfigurer {
    /**
     * Spring注册监听器
     *
     * @return
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    @Bean
    public ServletListenerRegistrationBean listenerRegister() {
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new OnlineCountListener());

        return servletListenerRegistrationBean;
    }
}
