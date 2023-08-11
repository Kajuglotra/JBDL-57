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
        System.out.println(bank.defaultExample());
        System.out.println(Bank.staticExample());
        System.out.println(HdfcBank.staticExample());
        System.out.println(Bank.num);

    }
}
