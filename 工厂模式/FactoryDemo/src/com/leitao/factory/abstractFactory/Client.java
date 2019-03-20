package com.leitao.factory.abstractFactory;

import com.leitao.factory.abstractFactory.interfaceFile.CarFacory;
import com.leitao.factory.abstractFactory.interfaceFile.Engine;
import com.leitao.factory.abstractFactory.interfaceImpl.goodCarFactory;

public class Client {
    public static void main(String[] args){
        CarFacory facory = new goodCarFactory();  //先创建一个汽车工厂，用于汽车生产
        Engine e = facory.createEngine();  //通过汽车工厂，上产一个引擎，由于该引擎是通过高级汽车工厂制造的，所以该引擎也是高级引擎
        e.run();
        e.start();
    }
}