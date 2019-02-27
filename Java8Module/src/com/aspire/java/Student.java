package com.aspire.java;

/**
 * @author wangxiantuan
 * @create 2019/2/27 - 12:21
 */
public class Student implements Person{

    @Override
    public void pName() {
        System.out.println("小名");
    }

    public static void main(String[] args) {
        System.out.println("可以调用接口中的实现方法");
        Person p = new Student();
        p.eat();
    }
}
