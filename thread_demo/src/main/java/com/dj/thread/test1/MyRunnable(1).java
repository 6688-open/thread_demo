package com.dj.thread.test1;

/**
 * 实现Runnable
 */
public class MyRunnable implements Runnable{

    /**
     * 重写Run()
     */
    @Override
    public void run() {
        System.out.println(System.currentTimeMillis() + "MyRunnable");
    }
}
