package gfg.thread.exexutorService;

import java.util.concurrent.Callable;

public class VolatileDemoTask implements Runnable {

    private  volatile static int value = 0;
    private String type; // write/read

    public VolatileDemoTask(String type) {
        this.type = type;
    }

    @Override
    public void run() {
        if(type == "W"){
            while(value  != 5){
                value++;
                System.out.println("Write value : "+ value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        else {
            int temp =0;
            while(true){
                if(temp != value){
                    temp = value;
                    System.out.println("Read Value : "+ value);
                }
            }
        }

    }
}
