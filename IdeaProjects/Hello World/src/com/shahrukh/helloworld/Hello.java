package com.shahrukh.helloworld;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
//        System.out.print("Hello World");
        System.out.println("Hello World");
        ///one nice way to get user input in java
        System.out.println("Please Enter A Number");
        Scanner scanner=new Scanner(System.in);
        int ans=scanner.nextInt();
        System.out.println("Anwer was="+ans);

        System.out.println("Please Enter Your Name");
        String Name=scanner.next();
        System.out.println("Hello "+Name);

        //random numbers
        Random random=new Random();
        int no=random.nextInt(20);
        System.out.println("Random number was="+no);
    }
}
