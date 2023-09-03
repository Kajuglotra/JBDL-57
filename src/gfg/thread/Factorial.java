package gfg.thread;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ThreadFactory;

public class Factorial {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Integer[] arr2 = new Integer[]{10000,20000,30000,40000,50000,60000,70000,80000,90000,100000};
        long startTime = System.currentTimeMillis();

        Arrays.stream(arr2).parallel().map(i-> getFactorial(i)).forEach(i-> System.out.println(i));
        long endTime = System.currentTimeMillis();
        System.out.println("time taken : " +(endTime-startTime));

    }
    public static BigInteger getFactorial(int num){
        BigInteger result = BigInteger.ONE;
        for(int i = 2; i<= num ; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
