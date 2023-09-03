package org.inheritance;

public class Client {
    public static void main(String[] args) {
        Child child = new Child();
        child.data =1;
        Address address = new Address("Hisar" , "!25001");
        org.inheritance.Student student = new Student("John",address );
    }
}
