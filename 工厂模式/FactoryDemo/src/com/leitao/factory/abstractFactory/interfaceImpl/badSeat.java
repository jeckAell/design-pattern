package com.leitao.factory.abstractFactory.interfaceImpl;

import com.leitao.factory.abstractFactory.interfaceFile.Seat;

public class badSeat implements Seat {

    @Override
    public void comfortable() {
        System.out.println("一般舒服舒服");
    }
}
