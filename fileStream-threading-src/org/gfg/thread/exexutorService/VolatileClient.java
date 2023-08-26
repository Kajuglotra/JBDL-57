package org.gfg.thread.exexutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VolatileClient {
    public static void main(String[] args) throws InterruptedException {
        VolatileDemoTask demoTask = new VolatileDemoTask("W");
        VolatileDemoTask demoTask1 = new VolatileDemoTask("R");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(demoTask);
        executorService.submit(demoTask1);

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("done ");
    }
}
