package com.dj.thread.test2;

/**
 * 测试等待锁
 */
public class TestWait {

    public static void main(String[] args) throws InterruptedException {
        // 共同操作一个对象
        Object obj = new Object();
        MyWait zs = new MyWait("zs", obj);
        MyWait ls = new MyWait("ls", obj);
        zs.start();
        ls.start();
        MyNotify mn = new MyNotify("ss", obj);
        mn.start();
    }
}
