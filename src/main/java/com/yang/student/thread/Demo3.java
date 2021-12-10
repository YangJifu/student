package com.yang.student.thread;

/**
 * @Author Yang~
 * @Description Runnable，重写run()方法，然后使用Thread类包装
 * @Date 2021/12/9 09:20
**/
public class Demo3 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        new Thread(runnable).start();
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"\n"+Thread.currentThread().getId());
    }
}