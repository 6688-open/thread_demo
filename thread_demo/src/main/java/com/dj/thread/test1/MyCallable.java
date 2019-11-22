package com.dj.thread.test1;

import java.util.concurrent.Callable;

/**
 * 实现Callable接口，重写call()
 * 接口的泛型定义返回值类型
 */
public class MyCallable implements Callable<String> {

    /**
     * 具有返回值的线程方法
     */
    @Override
    public String call() throws Exception {
        System.out.println("myCallable");
        return "return myCallable";
    }
}