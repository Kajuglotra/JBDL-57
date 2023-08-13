package org.encapsulation;

public class EncapulationDemo {


     String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        System.out.println("setting new data..");
        this.data = data;
    }

    public EncapulationDemo(){

    }
    protected EncapulationDemo(String data){
        this.data =data;
    }
}
