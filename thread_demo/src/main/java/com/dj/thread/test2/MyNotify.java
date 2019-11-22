package com.dj.thread.test2;

public class MyNotify extends Thread {

    private Object obj;

    public MyNotify(String name, Object obj) {
        super(name);
        this.obj = obj;
    }

    @Override
    public void run() {
        System.out.println(getName() + " 进入Notify " + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
            // 同步锁
            synchronized (obj) {
                obj.notify();
                System.out.println("解锁1");
//                obj.notifyAll();
                Thread.sleep(2000);
                obj.notify();
                System.out.println("解锁2");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " 结束Notify" + System.currentTimeMillis());
    }
}
