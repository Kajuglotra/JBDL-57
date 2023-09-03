package gfg.streams;

public class Main {

    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterfaceExample = new FunctionalInterfaceExample() {
            @Override
            public int add(int a, int b, int c) {
                return a+b+c;
            }
        };
//        //calling
//        System.out.println(functionalInterfaceExample.add(2,3));

        // java provides some another way to write the same thing in another way

        // () -> u are calling a method
        // add()
        FunctionalInterfaceExample functionalInterfaceExample1 = (int a, int  b, int c) -> {
            System.out.println("I am here in the body");
            return  a+b+c;
        };

        functionalInterfaceExample1.add(2,3,5);



    }
}

//class extends class
// interface extends interface

// class implements interface
// interface implements class
