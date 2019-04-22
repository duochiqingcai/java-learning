package com.dcqc.demo.学习笔记.进阶.Java三大器.拦截器Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: interview
 * @description 实现与过滤器demo相同的功能;该类可以通过实现HandlerInterceptor接口或者继承HandlerInterceptorAdapter类完成自定义.
 * @author: duochiqingcai
 * @create: 2019-03-13 23:58
 **/
public class DemoInterceptor implements HandlerInterceptor {
    long startTime = System.currentTimeMillis();

    /**
     * 请求前执行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        startTime = System.currentTimeMillis();

        return true;
    }

    /**
     * 请求结束执行，需要preHandle返回true才会执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器：请求执行消耗时间" + (System.currentTimeMillis() - startTime));
    }

    /**
     * 视图渲染完成执行，也需要preHandle返回true才会执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
