package com.dj.thread.test1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCase {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 继承Thread类直接start()
        MyThread mt = new MyThread();

//        mt.run();
        //实现Runnable 借助Thread类启动
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);

//        mt.start();
//        t1.start();
//
//        // Callable
        Callable<String> mc = new MyCallable();
        // 包装为FutureTask
        FutureTask<String> future = new FutureTask<>(mc);
        // 启动线程
        Thread t2 = new Thread(future);
        t2.start();
        // 获取线程对象执行的返回值
        String result = future.get();
        System.out.println(result);
//        System.out.println("11111");
    }
}
