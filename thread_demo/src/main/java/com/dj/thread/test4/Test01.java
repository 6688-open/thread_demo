package com.dj.thread.test4;

public class Test01 {
    public static void main(String[] args) {
        //int a = 1;// a = 1 栈
        Object obj = new Object(); // 栈 obj=内存地址

        String s1 = "hello";// s1 栈 hello在常量池
        String s2 = "hello";

        String s3 = new String("hello");// 3
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);


    }
}
