package com.dj.thread.test2;

public class MyThread extends Thread{

    @Override
    public void run() {
//        System.out.println("====");
        try {
//            // 让当前线程休息2秒
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" world");
    }
}
