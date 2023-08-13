package org.encapsulation;

public class Client {
    public static void main(String[] args) {
        EncapulationDemo demo = new EncapulationDemo("dummyData");
        demo.setData("dummyData1");
        demo.setData("dummyData2");
        demo.data="dummyData3";
//        System.out.println(demo.getData());
    }
}
