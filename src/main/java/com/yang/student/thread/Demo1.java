package com.yang.student.thread;

//线程的创建方法1，重写run()方法
public class Demo1 {
    public static void main(String[] args) {
        new MyThread().run();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"\n"+Thread.currentThread().getId());
    }
}
