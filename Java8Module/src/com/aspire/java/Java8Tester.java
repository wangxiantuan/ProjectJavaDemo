package com.aspire.java;

/**
 * @author wangxiantuan
 * @create 2019/2/27 - 14:14
 */
public class Java8Tester {
    final static String helloStr = "hello! ";
    public static void main(String[] args) {
        Java8Tester terster = new Java8Tester();
        //类型声明
        MathOperation addition = (int a,int b) -> a+b;
        //不用类型声明
        MathOperation subtraction = (a,b) -> a -b;
        //大括号中的返回语句
        MathOperation multiplication = (int a, int b) ->{
            return a * b;
        };
        //没有大括号及返回语句
        MathOperation division = (int a, int b) -> a/ b;
        System.out.println("10+5=" + terster.operate(10,5,addition));
        System.out.println("10-5=" + terster.operate(10,5,subtraction));
        System.out.println("10*5=" + terster.operate(10,5,multiplication));
        System.out.println("10/5=" + terster.operate(10,5,division));
        //不用括号
        GreetingService greetingService1 = message -> System.out.println("Hello"+message);
        //用括号
        GreetingService greetingService2 = (message) -> System.out.println("Hello2"+message);
        greetingService1.sayMessage("Runoob");
        greetingService2.sayMessage("Google");

        System.out.println("=======================================");
        //====================================
        GreetingService greetingService01 = message -> System.out.println(helloStr+message);
        greetingService01.sayMessage("niudun");
        //相当于
        GreetingService greetingService02 = new GreetingService() {
            @Override
            public void sayMessage(String message) {
                System.out.println(helloStr+message);
            }
        };
        greetingService02.sayMessage("aiyinsitan");

    }

    interface MathOperation{
        int operation(int a,int b);
    }
    interface GreetingService{
        void sayMessage(String message);
    }
    private int operate(int a,int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
