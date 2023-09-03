package gfg.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactorialClient {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Integer[] arr2 = new Integer[]{10000,20000,30000,40000,50000,60000,70000,80000,90000,100000};
        long startTime = System.currentTimeMillis();
        List<Thread> list = new ArrayList<>();
        Arrays.stream(arr2).forEach( i -> {
            FactorialMT factorialMT = new FactorialMT(i);
            Thread thread = new Thread(factorialMT);
            thread.start();
            list.add(thread);
        });
        list.stream().forEach(i -> {
            try {
                i.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        long endTime = System.currentTimeMillis();
        System.out.println("time taken : " +(endTime-startTime));
    }
}
