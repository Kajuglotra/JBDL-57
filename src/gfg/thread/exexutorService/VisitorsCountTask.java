package gfg.thread.exexutorService;

import java.util.concurrent.atomic.AtomicInteger;

public class VisitorsCountTask implements Runnable{

    private int visitors;

    public VisitorsCountTask() {
        this.visitors = 0;
    }

    public int getVisitors() {
        return visitors++;
    }

    @Override
    public void run() {
        getAndAdd();
    }
    public synchronized void getAndAdd(){ // this keyword is not allowing u to use multithreading
        visitors++;
    }

}
