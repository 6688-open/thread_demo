package com.dj.thread.test1;

/**
 * 继承Thread类
 */
public class MyThread extends Thread {
    /**
     * 重写Run()方法
     */
    @Override
    public void run() {
        System.out.println(System.currentTimeMillis() + "MyThread");
    }
}
