package gfg.thread.exexutorService;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        int corePoolSize = 3;
        int maxPoolSize =10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
                (corePoolSize,maxPoolSize, 30L, TimeUnit.SECONDS,new ArrayBlockingQueue<>(1));

        for(int i = 0; i<20 ; i++) {
            System.out.println("I am in the loop with the thread name : "+Thread.currentThread().getName() );
            threadPoolExecutor.submit(task); // new thread here
        }

        System.out.println("I am out of  loop with the thread name : "+Thread.currentThread().getName() );
        threadPoolExecutor.shutdown(); // signal  -> all the tasks which are already given will be done
//        threadPoolExecutor.submit(task);
//        threadPoolExecutor.shutdownNow(); // executor service will stop at the same time

        //await termination will wait till the time mentioned to go to the next line
        // if all the tasks are done before that specified time
        // then next statement will get printed at the end
        // if the tasks are not done in that time
        // then next statement will not wait more that time given and this next statement will get printed in between

        threadPoolExecutor.awaitTermination(1, TimeUnit.MILLISECONDS);
        System.out.println("Done");
    }
}
