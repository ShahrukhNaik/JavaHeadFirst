package com.shahrukh.staticclass;

public class Test {
    public static String name;
    public  int age;
    public String skincolor;

    public Test(int age, String skincolor) {
        this.age = age;
        this.skincolor = skincolor;
    }

    public static String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSkincolor() {
        return skincolor;
    }

    public static void setName(String name) {
        Test.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSkincolor(String skincolor) {
        this.skincolor = skincolor;
    }
}
