package org.polymorphism;

public class ChildCalculator extends ParentCalculator{
//    @Override
    public int sum(int a, int b){
        return 1+a+b;
    }

    public int multiply(int a , int b){
        return a*b;
    }
}
// parent class a method

//@Override --> good practice
// child class a method