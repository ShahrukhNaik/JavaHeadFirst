package com.shahrukh.oopchallangetest;

import java.util.Scanner;

public class Main {
    //in this programm you will find the best use of polymorphisim and inheritance

    public static void main(String[] args) {
        patient patient=new patient("Brad",28,
                new eye("short sighted","left eye","blue",true),
                new eye("normal","right eye","blue",true),
                new heart("normal","heart",65),
                new stomach("PUD","stomach",false),
                new skin("Burned","skin","white",40));

        System.out.println("Name "+patient.getName());
        System.out.println("Age "+patient.getAge());

        Scanner scanner=new Scanner(System.in);


        boolean shouldFinish=false;
        while(!shouldFinish){
            System.out.println("Choose oragan:"+
                               "\n\t1. Left Eye"+
                                "\n\t2. Right Eye"+
                                "\n\t3. Stomach"+
                                "\n\t4. Stomach"+
                                "\n\t5. Skin"+
                                "\n\t6. Quit");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    patient.getLeftEye().getDetails();
                    if(patient.getLeftEye().getIsopen()){
                        System.out.println("\t\t1. Close the Eye");
                        if(scanner.nextInt()==1){
                            patient.getLeftEye().closed();
                        }else{
                            continue;
                        }
                    }else{
                        System.out.println("\t\t1. Open the Eye");
                        if(scanner.nextInt()==1){
                            patient.getLeftEye().Open();
                        }else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if(patient.getRightEye().getIsopen()){
                        System.out.println("\t\t1. Close the Eye");
                        if(scanner.nextInt()==1){
                            patient.getRightEye().closed();
                        }else{
                            continue;
                        }
                    }else{
                        System.out.println("\t\t1. Open the Eye");
                        if(scanner.nextInt()==1){
                            patient.getRightEye().Open();
                        }else {
                            continue;
                        }
                    }
                    break;

                    case 3:
                        patient.getHeart().getDetails();
                        System.out.println("\t\t1.change heart rate");
                        if(scanner.nextInt()==1){
                            System.out.println("Enter the new heart Rate");
                            int newheartrate=scanner.nextInt();
                            patient.getHeart().setRate(newheartrate);
                            System.out.println("Heart rate changed to"+patient.getHeart().getRate());
                        }else {
                            continue;
                        }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if(scanner.nextInt()==1){
                        patient.getStomach().Digest();
                    }else {
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish=true;
                    break;

            }

        }
    }
}
