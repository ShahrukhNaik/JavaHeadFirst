package com.shahrukh.oopchallangetest;

public class Organs {

    private String condition,name;

    public Organs(String condition, String name) {
        this.condition = condition;
        this.name = name;
    }

    public void getDetails(){
        System.out.println("Name="+getName());
        System.out.println("Medical Condition="+this.getCondition());
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public String getName() {
        return name;
    }
}
