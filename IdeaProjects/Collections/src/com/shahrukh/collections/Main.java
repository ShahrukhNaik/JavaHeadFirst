package com.shahrukh.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("meisam");
        names.add("Sarah");
//        System.out.println(names.get(0));
//        System.out.println(names.size());
//
//        names.remove("meisam");
//        names.clear();
        Map<String,String> emailList=new HashMap<>();
        emailList.put("mesiam","Meisam@gmail.com");
        emailList.put("Brad","Brad@gmail.com");

        System.out.println(emailList.get("mesiam"));
        System.out.println(emailList.size());
        emailList.remove("Brad");
        System.out.println(emailList.size());
        System.out.println(emailList.containsKey("meisam"));
        System.out.println(emailList.containsValue("Meisam@gmail.com"));

        ArrayList<Students> students=new ArrayList<>();
        students.add(new Students(1,"meisam"));
        students.add(new Students(2,"Brad"));
        for (Students s:students) {
            System.out.println(s.getId()+" "+s.getName());
        }

    }
}
