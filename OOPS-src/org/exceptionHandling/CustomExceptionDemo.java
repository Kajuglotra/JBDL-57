package org.exceptionHandling;

public class CustomExceptionDemo {

    public String checkAge(int age) {
        if(age> 10){
            return "age is valid";
        }else{
            throw new CustomException("age is not valid ");
        }
    }

    public static void main(String[] args) {
        CustomExceptionDemo customExceptionDemo = new CustomExceptionDemo();
        customExceptionDemo.checkAge(8);
    }
}
