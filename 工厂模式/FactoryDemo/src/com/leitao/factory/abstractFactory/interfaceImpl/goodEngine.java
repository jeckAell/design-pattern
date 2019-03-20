package com.leitao.factory.abstractFactory.interfaceImpl;

import com.leitao.factory.abstractFactory.interfaceFile.Engine;

public class goodEngine implements Engine {

    @Override
    public void run() {
        System.out.println("速度快");
    }

    @Override
    public void start() {
        System.out.println("加速快");
    }
}
