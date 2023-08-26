package org.gfg.thread.exexutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTask task = new CallableTask();

        //
//        Thread thread = new Thread(task) // runnable was getting passed
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<String>> result = new ArrayList<>();
        for(int i= 0 ;i< 20; i++) {
             result.add(executorService.submit(task));// runnable parallel
        }
        System.out.println("Here !!!");
        for(Future<String> f: result){
            System.out.println(f.get());
        }
       // blocking statement
        System.out.println("Here !!!");
    }
}
