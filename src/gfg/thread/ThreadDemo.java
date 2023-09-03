package gfg.thread;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(Runtime.getRuntime().availableProcessors());
//        Task task = new Task();
//        Thread thread =new Thread(task);
//        thread.run();
//        System.out.println("I am inside the main class" + Thread.currentThread());

        System.out.println("I am inside the main class" + Thread.currentThread());
        Task2 task2 = new Task2();
        Task2 task3 =  new Task2();

        task2.start();
        task3.start();
        task2.join();
        task3.join();

        System.out.println("I am inside the main class" + Thread.currentThread());
    }
}
// if i am creating an object with thread class
// then the target is null

// if i am creating an object with Runnable class
// then target is not null -> target =  runnable

//