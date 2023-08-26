package org.gfg.filestream;

import java.io.Serializable;

public class Person implements Serializable {

    //marker interface : empty interface

    private static final long serialVersionUID = -6849794470754667710L;

    private static String classVal = "abc";

    private String name;

    private int age ;

    transient private String passNo;

    public Person(String name, int age, String passNo) {

        this.name = name;
        this.age = age;
        this.passNo = passNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age + ", passNo" + passNo +
                '}';
    }
}
// no logic but jvm is checking while serializing

// serialization happens

// jvm generates a code -> serialVersionUid

// passed this data to file

// read the data from file  serialVersionUid got changed