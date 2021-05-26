package com.shahrukh.oopchallangetest;

public class eye extends Organs{
    private String color;
    private boolean isopen;

    public eye(String condition, String name, String color, Boolean isopen) {
        super(condition, name);
        this.color = color;
        this.isopen = isopen;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: "+this.getColor());
    }
    public void Open(){
        this.setIsopen(true);
        System.out.println(this.getName()+" Opened");
    }
    void closed(){
        this.setIsopen(false);
        System.out.println(this.getName()+" Closed");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setIsopen(Boolean isopen) {
        this.isopen = isopen;
    }

    public Boolean getIsopen() {
        return isopen;
    }
}
