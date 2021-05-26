package com.shahrukh;

import java.util.Arrays;

public class simplearray {
    public static void main(String[] args) {
        String[] names= new String[5];
        names[0]="shso";
        names[1]="sdha";
        for (String no: names){
            System.out.println(no);
        }

        int[] nos={1,2,3,4,5};

        for(int i=0;i<nos.length;i++){
            System.out.println(nos[i]);
        }
    }
}
