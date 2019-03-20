package com.leitao.factory.abstractFactory.interfaceImpl;

import com.leitao.factory.abstractFactory.interfaceFile.Engine;

public class lowEngine implements Engine {
    @Override
    public void run() {
        System.out.println("速度慢");
    }

    @Override
    public void start() {
        System.out.println("加速慢");
    }
}
