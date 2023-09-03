package org.inheritance;

public class Child extends Demo {


    int sum =0;
    public Child(){
        super();
        System.out.println("I am inside the constructor of child class");
    }

    public void getSum(){
        System.out.println(sum1);
        System.out.println(this.sum);
    }


}

// to create a child class object
// parent class object will get created by itself

