package com.yang.student.thread;

/**
 * @Auther: Yang~
 * @Date: 2021/12/9 09:24
 * @Description: 经典卖票
 */
public class Demo4 implements Runnable{
    public static void main(String[] args) {
        Demo4 sell = new Demo4();
        new Thread(sell).start();
        new Thread(sell).start();
    }

    private  int tick=100;
    @Override
    public void run() {
        while (true) {
            //同步代码块
            //好处：解决了线程的安全问题
            //弊端：相对降低了效率，因为同步外的线程都会判断同步锁
            //前提：同步中必须有多个线程并使用同一个锁
            synchronized (this){
                if (tick == 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "=========" + tick--);
            }
        }
    }
}
