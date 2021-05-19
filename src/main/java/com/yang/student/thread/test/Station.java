package com.yang.student.thread.test;

//站台类
public class Station extends Thread{
    //通过构造方法给线程名字赋值
    public Station(String name){
        super(name);//给线程起名字
    }
    //为了保持票数的一直，票数要静态
    static int tick = 20;
    //创建一个静态钥匙
    static Object key = "key";

    @Override
    public void run() {
        while (tick>0){
            // 这个很重要，必须使用一个锁，进去的人会把钥匙拿在手上，出来后把钥匙让出来
            synchronized (key){
                if(tick>0){
                    System.out.println(getName()+"卖出了第"+tick+"张票");
                    tick--;
                }else{
                    System.out.println("票卖完了");
                }
            }
            try{
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
