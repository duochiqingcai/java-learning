package com.dcqc.demo.学习笔记.基础.this和super;

/**
 * @program: java-learning
 * @description 子类   注：不管什么时候，实例化子类对象都需要先调用父类的构造方法
 * @author: duochiqingcai
 * @create: 2019-03-19 16:33
 **/
public class DemoZi extends DemoThis {
    //子类无参构造方法
    public DemoZi() {
        //这里子类的无参构造中，super()可以不写，jvm会编译运行时会默认添加super().
        //super();
        System.out.println("子类无参构造方法。");
    }

    //子类有参构造方法
    public DemoZi(String name) {
        //super(...)调用父类有参或者无参构造方法,若要使用super(...)必须放在首位,即在所以语句之前。
        super(name);
        System.out.println("子类有参构造方法。" + name);
    }

    @Override
    public void doSomething() {
        System.out.println("子类中的方法。");
        //super.doSomething();
    }
}
