package com.dcqc.demo.进阶.Java三大器.监听器Listener;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @program: interview
 * @description 控制类
 * @author: duochiqingcai
 * @create: 2019-03-13 15:33
 **/

@RestController
public class TestController {
    /**
     * 测试控制方法
     *
     * @param session
     */
    @RequestMapping("/online")
    public void countTest(HttpSession session) {
        System.out.println(session.getServletContext().getAttribute("count"));
    }
}
