package com.yang.student.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//implements Callable，重写call()方法，然后包装成java.util.concurrent.FutureTask, 再然后包装成Thread
//Callable：有返回值的线程，能取消线程，可以判断线程是否执行完毕
public class Demo2 {
    public static void main(String[] args) throws Exception{
        MyCallable callable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        new Thread(futureTask).start();
        //get方法会阻塞调用的线程
        Integer sum = futureTask.get();
        System.out.println(Thread.currentThread().getName() + Thread.currentThread().getId() + "=" + sum);
    }
}
class MyCallable implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"\n"+Thread.currentThread().getId());
        int sum =0;
        for (int i=0;i<=100000;i++){
            sum+=i;
        }
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName()+"\n"+Thread.currentThread().getId());
        return sum;
    }
}