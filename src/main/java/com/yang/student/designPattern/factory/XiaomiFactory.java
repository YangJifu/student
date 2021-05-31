package com.yang.student.designPattern.factory;

/**
 * 小米工厂
 * Created by Miracle Yang～ on 2021/5/31 10:55 上午
 */
public class XiaomiFactory implements IFactory{
    @Override
    public IphoneProduct iphoneProduce() {
        return new XiaomiIphone();
    }

    @Override
    public IrouterProduct iRouterProduce() {
        return new XiaomiRouter();
    }
}
