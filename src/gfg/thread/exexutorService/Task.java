package gfg.thread.exexutorService;

public class Task implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hey from thread : " + Thread.currentThread().getName());

    }
}
