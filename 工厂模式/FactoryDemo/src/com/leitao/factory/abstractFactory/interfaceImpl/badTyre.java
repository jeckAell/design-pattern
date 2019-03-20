package com.leitao.factory.abstractFactory.interfaceImpl;

import com.leitao.factory.abstractFactory.interfaceFile.Tyre;

public class badTyre implements Tyre {
    @Override
    public void quality() {
        System.out.println("坏轮胎");
    }
}
