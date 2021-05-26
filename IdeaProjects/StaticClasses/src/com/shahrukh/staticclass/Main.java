package com.shahrukh.staticclass;

public class Main {
    public static void main(String[] args) {
        Test test=new Test(25,"white");
        Test.setName("Meisam");
        System.out.println(Test.name);
        Test.name="bob";
        System.out.println(Test.name);
        System.out.println(test.getAge()+" "+test.getSkincolor());
    }
}
