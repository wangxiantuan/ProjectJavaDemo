package com.aspire.java;

/**
 * @author wangxiantuan
 * @create 2019/2/27 - 12:17
 * 模拟测试java8新特性
 */
public interface Person {
    public void pName();
    public default void eat(){
        System.out.println("我是java8新特性，可以在接口中通过default写方法具体实现");
    }
}
