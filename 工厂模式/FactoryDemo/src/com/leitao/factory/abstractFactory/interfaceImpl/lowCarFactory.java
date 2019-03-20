package com.leitao.factory.abstractFactory.interfaceImpl;

import com.leitao.factory.abstractFactory.interfaceFile.CarFacory;
import com.leitao.factory.abstractFactory.interfaceFile.Engine;
import com.leitao.factory.abstractFactory.interfaceFile.Seat;
import com.leitao.factory.abstractFactory.interfaceFile.Tyre;

public class lowCarFactory implements CarFacory {
    @Override
    public Engine createEngine() {
        return new lowEngine();
    }

    @Override
    public Seat createSeat() {
        return new badSeat();
    }

    @Override
    public Tyre createTyre() {
        return new badTyre();
    }
}
