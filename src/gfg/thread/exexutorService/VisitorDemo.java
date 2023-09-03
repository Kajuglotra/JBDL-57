package gfg.thread.exexutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VisitorDemo {
    public static void main(String[] args) throws InterruptedException {
        VisitorsCountTask visitorsCountTask = new VisitorsCountTask();
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for(int i = 0; i<200000 ;i++){
            executorService.submit(visitorsCountTask);
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("Total no of visitors inside the partyhall is : " +visitorsCountTask.getVisitors());
        System.out.println("Total no of visitors inside the partyhall is : " +visitorsCountTask.getVisitors());


    }
}
// use thread safe variable data structure
// synchronized