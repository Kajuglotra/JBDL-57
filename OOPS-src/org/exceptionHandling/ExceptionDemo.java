package org.exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

public class ExceptionDemo {

    public int test(int c) {

        try {

            int a = 10;
            int d = c;
            int b = a / d;
            System.out.println(b);
            String str = "abc";
            System.out.println(Integer.parseInt(str));
            return 0;

        } catch (ArithmeticException e) {
            try{
                String str = "abc";
                System.out.println(Integer.parseInt(str));
            }catch (NumberFormatException numberFormatException){
                numberFormatException.printStackTrace();
            }
            e.printStackTrace();
            return -1;
        } catch (NumberFormatException numberFormatException) {

            numberFormatException.printStackTrace();
            throw numberFormatException; // the flow will be over
        }catch (Exception e) {
            e.printStackTrace();
            return -1;
        }  finally {
            System.out.println("inside finally method");
        }


    }

    public void throwsExample1() throws Exception {
        int a =10;
        System.out.println(a);
        throw new Exception("some"); // no try and catch ->
    }
    public void throwsExample2() throws Exception {

            throwsExample1();


    }
    public void printData() throws IOException {

        try (FileInputStream fileInputStream = new FileInputStream("/Users/kajalglotra/Downloads/temp.txt")){


        }catch (FileNotFoundException foundException){
            System.out.println("something wrong !!");
        }
    }



    public static void main(String[] args) throws IOException {
        ExceptionDemo demo = new ExceptionDemo();
//        demo.test(1);
        demo.printData();
        System.out.println("here");
    }

}
// try -> chunk of code on which i want to see if any exception is coming


// throws -> throw karta h -> a function name  ->

// method 1 throws exception -> method 2 throws -> main -> jvm

// finally -> close some resources

// instead of using finally -> we are using try with resources

// custom exception -> exception / run time

