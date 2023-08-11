package org.abstraction;

public interface Bank {

     int num =10;

     String getBankName();

     String getUpiBankName();

     default String defaultExample() {
         return "I am inside bank default method Example"; // default body
     }
     static String staticExample(){
         return "I am inside static method Example";
     }
}
// 2 types of methods
// 1) abstract ---> it does noy has a body
// 2) concrete --> it has a body

// after java 8
// static method , default method

