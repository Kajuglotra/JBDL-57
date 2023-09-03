package org.EqualsHash;

import org.inheritance.Demo;

public class Student {

    public String name;
    public Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode(){
        return this.age.hashCode()+ this.name.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return  true;
        }
        if(!(obj instanceof org.inheritance.Student)){
            return false;
        }
        Student s = (Student) obj;
        if(s.name == this.name && s.age == this.age){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Student student1 = new Student("john" , 10);
        Student student2 = new Student("john" , 10);
        Student student3 = new Student("john1" , 100);
        org.inheritance.Demo demo =new Demo();
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student1.equals(student2));

        String str = new String("abc");
        String str1 = new String("abc");
        if(str1 == str){ // address location native
            System.out.println("== is also returning true");
        }else {
            System.out.println("== is also returning false");
        }
        System.out.println(str.equals(str1)); // value

    }
}


// hashcode , equals -> object class

// default implementations -> object class

// override the implementation

// hashcode - > a function which calculate a alpha-numeric basis on memory location

// equals -> checking if hashcode are equal or not  by default
// object a
// object b
