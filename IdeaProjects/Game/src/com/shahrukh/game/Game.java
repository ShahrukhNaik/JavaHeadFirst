package com.shahrukh.game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess the Number");
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter Your Name");
        String name=scanner.next();
        System.out.println("Hello "+name);
//        System.out.println("Do you Wish to paly the Game? ");
        System.out.println("shall we start");
        System.out.println("\t1.yes");
        System.out.println("\t2.no");
        int ans=scanner.nextInt();
        int noofguess=0;
        System.out.println("Welcome"+name);
        while(ans==1){
            Random r=new Random();
            int no=r.nextInt(5)+1;
            System.out.println(no);
            System.out.println("guess the no");
            int uno=scanner.nextInt();
            noofguess++;
            if(uno==no){
                System.out.println("Your guess is correct");
                break;
            }else if (noofguess>5){
                System.out.println("you are out of chances");
                break;
            }
        }
        System.out.println("see you next time");


    }
}
