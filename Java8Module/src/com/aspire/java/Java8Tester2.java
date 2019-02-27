package com.aspire.java;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wangxiantuan
 * @create 2019/2/27 - 15:47
 */
public class Java8Tester2 {
    public static void main(String[] args) {
//        final int num = 1;
        int num = 1;
//        int param = 666;//lambda表达式中的变量名或参数名不能与局部变量名相同
        Converter<Integer,String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);//输出结果为3

//        num = 5; lambda表达式中所使用的变量必须具有final 的语义


        System.out.println("==================Lambda表达式使用举例=========================");
        System.out.println("1.创建线程");
        //原写法
        Thread td = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程创建原写法，hello~~~~~~~~~~~~");
            }
        });
        td.start();
        //使用lambda写法
        Thread td2 = new Thread(() -> System.out.println("线程创建lambda写法，hello lambda"));
        td2.start();
        System.out.println("2.排序");
        List<String> list = new ArrayList<>();
        list.add("ss11");
        list.add("dd988");
        list.add("aa877");
        System.out.println("原list："+list);
        //匿名内部类写法
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("排序："+list);
        //lambda 写法
        Collections.sort(list,(str1,str2) -> str1.compareTo(str2));
        System.out.println("lambda写法排序后："+ list);

        System.out.println("======================");
        System.out.println("将字符串转换为全小写");
        List<String> proNames = Arrays.asList(new String[]{"NI","HAO","LAMBDA"});
        System.out.println("转换前："+proNames);
        List<String> lowercaseNames = proNames.stream().map(name ->{return name.toLowerCase();}).collect(Collectors.toList());
        System.out.println("转换后："+lowercaseNames);

        System.out.println("将字符串转换为全小写");
        List<String> proNames2 = Arrays.asList(new String[]{"ni","hao","lambda"});
        System.out.println("转换前："+proNames2);
        List<String> upperCaseNames = proNames2.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println("转换后："+upperCaseNames);
    }
    public  interface  Converter<T1,T2>{
        void convert(int i);
    }


}
