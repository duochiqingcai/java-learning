package com.dcqc.demo.学习笔记.基础.异常;

/**
 * @program: java-learning
 * @description
 * @author: duochiqingcai
 * @create: 2019-04-09 23:12
 **/
public class MyException extends RuntimeException {
    /**
     * 异常编码
     */
    private String exceptionCode;

    public MyException(String message, String exceptionCode) {
        super(message);
        this.exceptionCode = exceptionCode;
        System.out.println(message + " " + exceptionCode);
    }

    public String getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode;
    }
}
