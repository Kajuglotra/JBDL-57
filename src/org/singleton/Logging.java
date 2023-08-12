package org.singleton;

public class Logging {

    public static Logging instance=new Logging();
    private Logging(){
    }

    public void info(String message){
        System.out.println(message);
    }
//    public static Logging getInstance(){
//        if(instance == null){
//            System.out.println("i am inside if");
//            instance = new Logging();
//            return instance;
//        }else {
//            System.out.println("i am inside else");
//            return instance;
//        }
//    }
    // someway by which we can create an object

}
// singleton

// static
// print