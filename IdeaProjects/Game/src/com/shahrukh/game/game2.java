package com.shahrukh.game;

import java.util.Random;
import java.util.Scanner;

public class game2 {
    public static void main(String[] args) {
        System.out.println("Welcome to guess the no");
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=in.next();
        System.out.println("Welcome "+name);
        System.out.println("shall we start ?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");
        int ans=in.nextInt();
        int noofcount=0;
        while (ans==1){
            Random r=new Random();
            int no=r.nextInt(20)+1;
            noofcount++;
            System.out.println("guess the no");
            int no2=in.nextInt();
            if(no2==no){
                System.out.println("You Gussed it Right");
                break;
            }
            else if(noofcount>5){
                System.out.println("You are out of tries");
                break;
            }
        }
        System.out.println("See you soon");
    }
}
