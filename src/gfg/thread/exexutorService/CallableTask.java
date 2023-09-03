package gfg.thread.exexutorService;

import java.util.concurrent.Callable;

public class CallableTask implements Callable {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "I am in the call method with Thread Name :" +Thread.currentThread().getName();
    }
}
