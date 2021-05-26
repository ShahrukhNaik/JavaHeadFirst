package com.shahrukh.oopchallangetest;

public class stomach extends Organs{
    private boolean isEmpty;

    public stomach(String condition, String name, Boolean isEmpty) {
        super(condition, name);
        this.isEmpty = isEmpty;
    }
    public  void Digest(){
        System.out.println("Digesting Begins..");
    }

    @Override
    public void getDetails() {
        super.getDetails();
        if(this.isEmpty){
            System.out.println("needs to be fed");
        }
        else{
            System.out.println("Stomach is full");
        }
    }

    public Boolean getEmpty() {
        return isEmpty;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }

}

