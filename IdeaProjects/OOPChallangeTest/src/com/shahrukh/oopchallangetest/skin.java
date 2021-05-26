package com.shahrukh.oopchallangetest;

public class skin extends Organs{
    private String color;
    private int softness;

    public skin(String condition, String name, String color, int softness) {
        super(condition, name);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin  color "+this.getColor());
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
