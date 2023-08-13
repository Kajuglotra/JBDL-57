package org.exceptionHandling;

import java.io.Closeable;
import java.io.IOException;

public class CloseableDemo implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("I am inside the close method");
    }

    public void printData(){
        System.out.println("printing some data ");
    }

    public static void main(String[] args) throws IOException {

       try( CloseableDemo demo = new CloseableDemo()){
           demo.printData();

       }finally {

       }

    }
}
// age from the user -> age < 10 throw an exception otherwise no