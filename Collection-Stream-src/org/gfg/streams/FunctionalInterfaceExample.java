package org.gfg.streams;

public interface FunctionalInterfaceExample {

//    int add(int a, int b);

    abstract int add(int a, int b, int c);

    default int sum(int a, int b, int c){
        return a+b+c;
    }
}


// functional interface

// @Override