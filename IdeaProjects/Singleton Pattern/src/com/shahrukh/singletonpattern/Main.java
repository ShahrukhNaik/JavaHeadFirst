package com.shahrukh.singletonpattern;

public class Main {
    public static void main(String[] args) {
        Database bd= Database.getInstance("db_demo");
//        bd.setName("moc database");
        System.out.println(bd.toString());
    }
}
