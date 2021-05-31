package com.yang.student.designPattern.factory;

/**
 *抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
 * Created by Miracle Yang～ on 2021/5/31 10:59 上午
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("=========小米系列=========");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IphoneProduct xiaomiIphone = xiaomiFactory.iphoneProduce();
        xiaomiIphone.start();
        xiaomiIphone.cell();
        xiaomiIphone.send();
        xiaomiIphone.stop();
        IrouterProduct xiaomiRouter = xiaomiFactory.iRouterProduce();
        xiaomiRouter.openWifi();

        System.out.println("=======华为系列=======");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IphoneProduct huaweiIphone = huaweiFactory.iphoneProduce();
        huaweiIphone.stop();
        IrouterProduct huaweiRouter = huaweiFactory.iRouterProduce();
        huaweiRouter.openWifi();
    }
}
