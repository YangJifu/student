package com.yang.student.designPattern.factory;

/**
 * 小米路由器
 * Created by Miracle Yang～ on 2021/5/31 10:47 上午
 */
public class XiaomiRouter implements IrouterProduct{
    @Override
    public void start() {
        System.out.println("小米路由器开机");
    }

    @Override
    public void stop() {
        System.out.println("小米路由器关机");
    }

    @Override
    public void openWifi() {
        System.out.println("小米路由器打开wifi");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设置");
    }
}
