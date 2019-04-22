package com.dcqc.demo.学习笔记.进阶.Java三大器.过滤器Filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @program: interview
 * @description 此过滤器demo功能是记录请求执行时间。可以使用@WebFilter注解直接将类声明为过滤器
 * @author: duochiqingcai
 * @create: 2019-03-13 16:17
 **/
public class DemoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("DemoFilter过滤器创建.");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //记录开始时间
        long startTime = System.currentTimeMillis();

        // do something doFilter()之前可以对request进行操作
        //如需对response进行操作，可在此先创建HttpServletResponseWrapper的实现类对象


        //执行过滤器链，进行Servlet容器初始化，Servlet的doService()是在chain.doFilter()方法中执行的；对response操作，doFilter 的response参数需要是HttpServletResponseWrapper的实现类对象。
        filterChain.doFilter(servletRequest, servletResponse);


        //do something 如果要对response进行操作可以在这里进行；doFilter 的response参数需要是HttpServletResponseWrapper的实现类对象，详情可百度


        //注意：在实际运行的时候，会打印多个语句，因为⭐浏览器请求除了localhost可能还会有其他js、css、图片等静态文件；可以使用postman等接口测试工具测试
        System.out.println("这是过滤器：请求执行消耗时间" + (System.currentTimeMillis() - startTime));
    }

    @Override
    public void destroy() {
        System.out.println("DemoFilter过滤器销毁.");
    }
}
