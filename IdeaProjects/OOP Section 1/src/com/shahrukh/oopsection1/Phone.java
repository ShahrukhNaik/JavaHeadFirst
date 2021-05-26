package com.shahrukh.oopsection1;

public class Phone {
    private String name;
    int ram;
    String Processor;

    public void playmusic(String track){
        System.out.println("playing="+track);
    }
//    public void setName(String name){
//        this.name=name;
//    }
//
    public String getName() {
        return this.name;
    }
//
//    public void setRam(int ram) {
//        this.ram = ram;
//    }
//
    public int getRam() {
        return ram;
    }
//
//    public void setProcessor(String processor) {
//        this.Processor = processor;
//    }
//
    public String getProcessor() {
        return Processor;
    }
    //constructor..
    public Phone(String name,int ram,String processor){
        this.name=name;this.ram=ram;this.Processor=processor;
    }
    public Phone(String name,int ram){
        this.name=name;this.ram=ram;
    }
}
