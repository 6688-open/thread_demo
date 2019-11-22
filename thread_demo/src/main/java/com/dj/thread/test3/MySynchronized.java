package com.dj.thread.test3;

/**
 * 同步锁
 * 同步锁就是单位时间内让线程顺序执行
 */
public class MySynchronized {

    /**
     * 不允许并发访问该方法
     */
    public synchronized void synchronized1(){

    }

    /**
     * 不允许并发访问该方法
     */
    public synchronized static void synchronized2(){

    }

    /**
     * 任何线程都可以并发进入该方法
     * @param object
     */
    public synchronized void  synchronized3(Object object){
        // 同步代码块
        // 锁定对象
        synchronized (object){

        }
    }

    /**
     * 任何线程都可以并发进入该方法
     * @param object
     */
    public void synchronized4(Object object){
        // 同步代码块
        // 锁定本类 this表示本类
        synchronized (this){

        }
    }
}
