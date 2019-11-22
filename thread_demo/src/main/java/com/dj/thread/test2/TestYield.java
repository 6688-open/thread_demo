package com.dj.thread.test2;

public class TestYield {
    public static void main(String[] args) {
        MyYield zs = new MyYield("zs");
        MyYield ls = new MyYield("ls");
        zs.start();
        ls.start();
        // 交替执行与调用顺序无关
    }
}
