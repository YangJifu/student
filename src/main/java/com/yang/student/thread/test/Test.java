package com.yang.student.thread.test;
//java多线程对同一个类操作
//模拟三个站台同时出售20张票
//售票要使用同步锁：即有一个站台卖这张票时，其他站台要等待这张票卖完才能继续卖票！
public class Test {
    public static void main(String[] args) {
        Station station1 = new Station("窗口1");
        Station station2 = new Station("窗口2");
        Station station3 = new Station("窗口3");
        station1.start();
        station2.start();
        station3.start();
    }
}
