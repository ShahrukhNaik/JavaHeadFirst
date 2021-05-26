package com.shahrukh.interfaces;

public class electriccar implements  car{
    @Override
    public void start() {
        System.out.println("electricty has started running in the engine");
    }

    @Override
    public void move(int speed) {
        System.out.print(" is moving at the speed of "+speed);
    }

    @Override
    public void printname(String name) {
        System.out.print("name: "+name);
    }
}
