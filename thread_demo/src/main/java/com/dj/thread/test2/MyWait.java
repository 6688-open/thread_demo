package com.dj.thread.test2;

public class MyWait extends Thread{

    public MyWait(String name, Object obj) {
        super(name);
        this.obj = obj;
    }

    private Object obj;

    @Override
    public void run() {
        // 同步锁
        synchronized (obj) {
            try {
                System.out.println(getName() + " 进入wait " + System.currentTimeMillis());
                obj.wait();
                System.out.println(getName() + " 结束wait" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
