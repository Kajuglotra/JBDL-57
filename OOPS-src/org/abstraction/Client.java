package org.abstraction;

import java.util.List;

public class Client {

     String  val;

    public static void main(String[] args) {
//        Bank bank = new Bank() { // anonymous class not object
//            @Override
//            public String getBankName() {
//                return "anonymous name";
//            }
//
//            @Override
//            public String getUpiBankName() {
//                return "anonymous  upi name";
//            }
//        };

        Bank bank = new HdfcBank();
//        System.out.println(bank.defaultExample());
//        System.out.println(Bank.staticExample());
//        System.out.println(HdfcBank.staticExample());
//        System.out.println(Bank.num);
        System.out.println(bank.getBankName());
        // for
        // tostring
        System.out.println(BankEnum.values());
//        System.out.println(BankEnum.valueOf("101"));
        InnerClassDemo demo = new InnerClassDemo();

        InnerClassDemo.InnerClass innerClass = demo.new InnerClass();
        innerClass.printInfo();
//        InnerClassDemo.InnerClass innerClass1 = demo.new InnerClass();


//        InnerClassDemo demo1 =
    }
}
// class -> class
// interface -> interface