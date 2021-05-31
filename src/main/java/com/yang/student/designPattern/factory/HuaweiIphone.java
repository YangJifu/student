package com.yang.student.designPattern.factory;

/**
 * Created by Miracle Yang～ on 2021/5/31 10:35 上午
 */
public class HuaweiIphone implements IphoneProduct{
    @Override
    public void cell() {
        System.out.println("华为打电话");
    }

    @Override
    public void send() {
        System.out.println("华为发短信");
    }

    @Override
    public void start() {
        System.out.println("华为开机");
    }

    @Override
    public void stop() {
        System.out.println("华为关机");
    }
}
