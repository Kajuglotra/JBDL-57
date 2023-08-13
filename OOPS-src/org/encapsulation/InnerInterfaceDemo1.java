package org.encapsulation;

import org.abstraction.InnerClassDemo;
import org.abstraction.InnerInterfaceChild;
import org.abstraction.InnerInterfaceDemo;

public class InnerInterfaceDemo1 extends InnerInterfaceDemo{

    class Child implements InnerInterfaceDemo.InnerInterface{

        @Override
        public void printData() {

        }
    }

    InnerInterface innerInterface = new InnerInterface() {
        @Override
        public void printData() {

        }
    };
//
//    @Override
//    public void printData() {
//
//    }
}
