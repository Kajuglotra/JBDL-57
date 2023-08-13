package org.abstraction;

public class InnerClassDemo {

    public int value = 10;

    public  class InnerClass{
        public  int data = 20;
        public void printInfo(){
            System.out.println("I am inside the print info method");
        }
    }

    public static void main(String[] args) {
        InnerClassDemo innerClassDemo = new InnerClassDemo();
        InnerClassDemo.InnerClass innerClass  = innerClassDemo. new InnerClass();
        innerClass.printInfo();
    }
}
