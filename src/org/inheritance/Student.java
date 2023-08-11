package org.inheritance;

public class Student {

    String name;
    Address address;
    int num =1;
    public Student(String name, Address address){
//        name ="kajal";

        // priority will always go to local variable
        this.name=name;
        this.address =address;
    }

//    public Student(){
//
//    }

    public String test()
    {
        int num1 =10;
        System.out.println(num);
        return "";

    }
}
