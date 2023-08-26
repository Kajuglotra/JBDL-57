package org.gfg.filestream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p = new Person("John", 20 , "65");
        writeObjectToFile(p);
        readObjectFromFile();

    }
    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/Users/kajalglotra/Downloads/JBDL/JBDL-57/Thread/demo.txt");
        ObjectInputStream inputStream  = new ObjectInputStream(fileInputStream);
        Object o = inputStream.readObject();

    }
    public static void writeObjectToFile(Person p) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/kajalglotra/Downloads/JBDL/JBDL-57/Thread/demo.txt");
//        Object  class does not provide any method to get bytes of a custom object

        // whenever I want to write an object to the file
        // i need to use one more class

        // password, --> sensitive
        // saving same data to same system's file

        // saving this data to some another system
        // pass the data to the another system
        //converting the data into bytes

        // bytes will be written in the files

        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(p);
    }
}
