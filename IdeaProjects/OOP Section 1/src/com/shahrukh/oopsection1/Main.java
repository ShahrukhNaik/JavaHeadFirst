package com.shahrukh.oopsection1;

public class Main {
    public static void main(String[] args) {
//        Phone obj=new Phone("iphone 11",6,"A14");
        Phone obj=new Phone("pixel 4",6);

        obj.playmusic("Friction");
//        obj.setName("iphone 11");
        System.out.println(obj.getName());
//        obj.setRam(6);
        System.out.println("Ram="+obj.getRam()+"GB");
//        obj.setProcessor("A14 bionic");
//        System.out.println("Processor="+obj.getProcessor());

    }
}
