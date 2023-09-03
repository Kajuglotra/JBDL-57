package gfg.thread;

public class Task2 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Kajal with the thread name  : " + Thread.currentThread());

    }
}

//parent class -> run
//child class -> run -->


// runnable
// thread class run method will get called
