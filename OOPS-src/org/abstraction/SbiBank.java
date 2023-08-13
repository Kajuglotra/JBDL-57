package org.abstraction;

public class SbiBank implements Bank{
    @Override
    public String getBankName() {
        return "SBI";
    }

    @Override
    public String getUpiBankName() {
        return "SBI_UPI";
    }
}
