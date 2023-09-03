package org.abstraction;

public enum BankEnum {

    // shorter database which is inside your code base
//    HDFC("hdfc", 101, true), ICICI("icici" ,102 , false); // we are creating objects of enum class
//
//    public String name;
//
//    private int id;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    private boolean isActive;
//
//    public boolean isActive() {
//        return isActive;
//    }
//
//    public void setActive(boolean active) {
//        isActive = active;
//    }
//
//    BankEnum(String val, int id , boolean isActive){
//        this.name = val;
//        this.id =id;
//        this.isActive =isActive;
//    }
    HDFC, ICICI;
    BankEnum(){}

}
// enum -> this constructor is always private

// internally
//public  class BankEnum extends Enum,

//variable with out value