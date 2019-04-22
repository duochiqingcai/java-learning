package com.dcqc.demo.学习笔记.进阶.Java三大器.监听器Listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @program: interview
 * @description 监听网站在线人数
 * @author: duochiqingcai
 * @create: 2019-03-13 15:10
 **/

  //声明此类位监听器
public class OnlineCountListener implements HttpSessionListener {
    private int count = 0;

    /**
     * 监控session创建
     *
     * @param arg0
     */
    public void sessionCreated(HttpSessionEvent arg0) {
        System.out.println("这是监听器：监听session创建");
        count++;
        arg0.getSession().getServletContext().setAttribute("count", count);
    }

    /**
     * 监听session撤销
     *
     * @param se
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("这是监听器：监听session的删除");
        count--;
        se.getSession().getServletContext().setAttribute("count", count);
    }
}
