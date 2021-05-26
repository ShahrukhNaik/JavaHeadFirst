package com.shahrukh.interfaces;

public class main {
    public static void main(String[] args) {
        car car1=new electriccar();
        car1.start();
        car1.printname("Tesla");
        car1.move(75);
    }
}
