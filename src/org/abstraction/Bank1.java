package org.abstraction;

public interface Bank1 {
    String getBankName();

    default String defaultExample() {
        return "I am inside bank1 default method Example"; // default body
    }
}
