package org.singleton;

public class Client {
    public static void main(String[] args) {
        Logging logging = Logging.getInstance();
        logging.info("print my message");
        Logging logging1 = Logging.instance;
        logging.info("print my message2");

    }
}
// Exception Handling

//calculation
// multiply 2 num ---> mistake -> addition

// throwable -> class
//public class  A extends Throwable, Exception, RuntimeException

//serializable
//runnable
//callable