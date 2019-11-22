package com.dj.thread.test3;

public class TestCase {
    static int num = 0;
    public  static synchronized void numAdd(){
        num++;
    }

    public  static synchronized int numget(){
        return num;
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //num++;
                numAdd();
                System.out.println("t1 " + numget());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                numAdd();
                System.out.println("t2 " + numget());
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                numAdd();
                System.out.println("t3 " + numget());
            }
        });
        t1.start();
        t2.start();
        t3.start();
        // 结果并不是 t1 1 t2 1 t3 1 而是多种情况
    }
}
