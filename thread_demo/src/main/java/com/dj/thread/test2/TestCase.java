package com.dj.thread.test2;


public class TestCase {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.currentTimeMillis());
        MyThread t = new MyThread();
        // start()的结果为 hello world
        t.start();
        // 直接run()的结果为 worldhello
//        t.run();

        System.out.print("hello ");
        Thread.sleep(3000);
//        System.out.print("world ");
        System.out.println(System.currentTimeMillis());
    }
}
