package org.singleton;

public class Logging {

    public static Logging instance;
    private Logging(){
    }

    public void info(String message){
        System.out.println(message);
    }

    // making my complete func as single threaded
    public static Logging getInstance(){
        if(instance == null){
            synchronized (Logging.class){
                if(instance == null){
                   instance =new Logging();
                }
            }
            // thread1 -> 11.00.00
            // thread2 -> 11.00.01
            System.out.println("i am inside if");
            instance = new Logging();
            return instance;
        }else {
            System.out.println("i am inside else");
            return instance;
        }
    }

    // someway by which we can create an object

}
// singleton

// static
// print

//1 ) early initialization
// 2) synchronized function
// 3) synchronized block
