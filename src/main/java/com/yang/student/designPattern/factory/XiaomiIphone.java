package com.yang.student.designPattern.factory;

/**
 * 小米手机
 * Created by Miracle Yang～ on 2021/5/31 10:34 上午
 */
public class XiaomiIphone implements IphoneProduct{
    @Override
    public void cell() {
        System.out.println("小米打电话");
    }

    @Override
    public void send() {
        System.out.println("小米发短信");
    }

    @Override
    public void start() {
        System.out.println("小米开机");
    }

    @Override
    public void stop() {
        System.out.println("小米关机");
    }
}
