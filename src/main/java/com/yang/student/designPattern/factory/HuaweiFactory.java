package com.yang.student.designPattern.factory;

/**
 * 华为工厂
 * Created by Miracle Yang～ on 2021/5/31 10:57 上午
 */
public class HuaweiFactory implements IFactory{
    @Override
    public IphoneProduct iphoneProduce() {
        return new HuaweiIphone();
    }

    @Override
    public IrouterProduct iRouterProduce() {
        return new HuaweiRouter();
    }
}
