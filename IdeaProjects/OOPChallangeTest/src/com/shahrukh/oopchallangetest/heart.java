package com.shahrukh.oopchallangetest;

public class heart extends Organs{
    private int rate;

    public heart(String condition, String name, int rate) {
        super(condition, name);
        this.rate = rate;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart Rate "+this.getRate());
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
}
