package com.leitao.factory.abstractFactory.interfaceImpl;

import com.leitao.factory.abstractFactory.interfaceFile.Seat;

public class goodSeat implements Seat {
    @Override
    public void comfortable() {
        System.out.println("很舒服");
    }
}
