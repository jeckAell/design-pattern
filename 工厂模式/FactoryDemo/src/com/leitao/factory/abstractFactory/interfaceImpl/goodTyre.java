package com.leitao.factory.abstractFactory.interfaceImpl;

import com.leitao.factory.abstractFactory.interfaceFile.Tyre;

public class goodTyre implements Tyre {
    @Override
    public void quality() {
        System.out.println("好轮胎");
    }
}
