package com.yang.student.designPattern.factory;

/**
 * Created by Miracle Yang～ on 2021/5/31 10:39 上午
 */
//抽象产品工厂
public interface IFactory {
    //手机
    IphoneProduct iphoneProduce();
    //路由器
    IrouterProduct iRouterProduce();
}
