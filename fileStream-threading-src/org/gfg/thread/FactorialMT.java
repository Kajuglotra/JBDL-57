package org.gfg.thread;

import java.math.BigInteger;

public class FactorialMT implements Runnable{

    private int num;

    public FactorialMT(int num){
        this.num = num;
    }
    @Override
    public void run() {
        BigInteger result = getFactorial();
        System.out.println("For num :"+this.num + "Thread-name : " +
                Thread.currentThread().getName() + " and the result is: " + result);
    }
    public BigInteger getFactorial(){
        BigInteger result = BigInteger.ONE;
        for(int i = 2; i<= this.num ; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
