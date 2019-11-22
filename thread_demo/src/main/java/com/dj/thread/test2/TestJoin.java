package com.dj.thread.test2;

public class TestJoin {

    public static void main(String[] args) throws InterruptedException {
        TestJoinT tjt = new TestJoinT();
        tjt.start();
        // 有join结果为5 没join结果为0
//        tjt.join();
        System.out.println(tjt.count);
    }

}
