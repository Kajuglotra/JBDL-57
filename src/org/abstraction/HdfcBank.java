package org.abstraction;

public class HdfcBank implements Bank, Bank1{


    private int data;

    private int temp;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public HdfcBank(){

    }

    public int getData() {
        return 0;
    }

    public void setData(int data) {
        this.data = data;
    }

    public HdfcBank getHdfcBankObject(){

        // condn
//        if(object )
        return new HdfcBank();
    }

    int sum = 0;

    @Override
    public String getBankName() {
        return String.valueOf(BankEnum.HDFC);
    }

    private String testMethod(){
        return String.valueOf(BankEnum.HDFC);

    }

    @Override
    public String getUpiBankName() {
        return "HDFC_UPI";
    }

    public String defaultExample() {
        return "I am inside HdfcBank bank default method Example";
    }
    static String staticExample(){
        return "I am inside HdfcBank static method Example";
    }
}

// class A  extend class B

// interface A  extend interface B

// class implement interface

// enum -> constants we are using during the whole implementation

// jbdl-57 status -> upcoming , live , running, archived ....