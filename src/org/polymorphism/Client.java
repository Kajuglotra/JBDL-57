package org.polymorphism;

public class Client {

    public static void main(String[] args) {
        ParentCalculator demo = new ParentCalculator();

        ChildCalculator calculator = (ChildCalculator) demo;
        System.out.println(calculator.sum(1,2));

//        System.out.println(demo.sum(1,2 ));
//        System.out.println(demo.sum(1,2,3));
//        ChildCalculator childCalculator = new ChildCalculator();
//
//        ParentCalculator parentCalculator = (ParentCalculator) new ChildCalculator(); // upcasting
//
//        System.out.println(parentCalculator.add(1,2,4));

        // downcaste the parent refrence to child

//        ChildCalculator calculator = (ChildCalculator) parentCalculator;  //--> downcasting


//        ChildCalculator calculator = new ParentCalculator();

        // compile time it will see the parent class method
        // run time it will call the child class method

//        System.out.println(calculator.add(1,2,3));
//        System.out.println(calculator.sum(1,2));
    }
}

// parent  interface   sum () body is not there

// child implementing the parent  sum() body bu youe own

// casting
// double d ;

// int
