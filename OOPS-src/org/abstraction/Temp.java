package org.abstraction;

public class Temp implements Bank{
    @Override
    public String getBankName() {
        return null;
    }

    @Override
    public String getUpiBankName() {
        return null;
    }

    @Override
    public String defaultExample() {
        return Bank.super.defaultExample();
    }


    public static void main(String[] args) {
        Temp temp = new Temp();
        System.out.println(temp.defaultExample());
    }
}


// class extend 1 class from it
// 1 class can only have 1 parent