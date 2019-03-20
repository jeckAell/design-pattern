package com.leitao.factory.abstractFactory.interfaceImpl;

import com.leitao.factory.abstractFactory.interfaceFile.CarFacory;
import com.leitao.factory.abstractFactory.interfaceFile.Engine;
import com.leitao.factory.abstractFactory.interfaceFile.Seat;
import com.leitao.factory.abstractFactory.interfaceFile.Tyre;

//在高级汽车的工厂类中，可以随意调用不同类别的“零件”，从而来组装成高级汽车或者是低级或者是混合的中级汽车
public class goodCarFactory implements CarFacory {

    @Override
    public Engine createEngine() {
        return new goodEngine();
    }

    @Override
    public Seat createSeat() {
        return new goodSeat();
    }

    @Override
    public Tyre createTyre() {
        return new goodTyre();
    }
}
