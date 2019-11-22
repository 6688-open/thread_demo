package com.dj.thread.test2;

public class TestJoinT  extends Thread{

    int count = 0;

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println("====");
        }
    }
}
