package com.shahrukh.concurrency;

public class Main {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("printing "+i+" in a worker thread");
                }
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        for(int i=0;i<5;i++){
            System.out.println("printing "+i+" in a main thread");
        }
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
