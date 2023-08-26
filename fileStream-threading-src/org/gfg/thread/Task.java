package org.gfg.thread;

public class Task implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Kajal with the thread name  : " + Thread.currentThread());
    }


}

//1) for one task which u want to run in multithreaded pattern, create a new class
// 2) Override run method
// 3) whatever things u want to acheive in multithreaded way,, write it down in the run method
// 4) create an object of thread

// 2 ways of creating an object of thread


// thread object create

// subclass child of thread class

// subclass run method
// thread class parent class -> run method

// child
// runnable implement class
// run

// thread (runnable)
// run



