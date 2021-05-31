package com.yang.student.designPattern;

/**
 * 代理模式
 * 实现：主要是通过定义一个继承抽象主题的代理来包含真实主题，从而实现对真实主题的访问。
 * Created by Miracle Yang～ on 2021/5/27 11:37 上午
 */
public class Proxy {
    public static void main(String[] args) {
        ProxyTest test = new ProxyTest();
        test.Request();
    }
}
//抽象主题
interface Subject{
    void Request();
}
//真实主题
class RealSubject implements Subject{

    @Override
    public void Request() {
        System.out.println("访问真实主题方法。。。");
    }
}

//代理
class ProxyTest implements Subject{
    private RealSubject realSubject;

    @Override
    public void Request() {
        if(realSubject==null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }
    public void preRequest(){
        System.out.println("访问真实主题之前的预处理");
    }
    public void postRequest(){
        System.out.println("访问真实主题之后的后续处理");
    }
}


