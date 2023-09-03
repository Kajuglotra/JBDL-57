package org.exceptionHandling;

public class CustomException extends RuntimeException { // unchecked exception
    public CustomException(String msg){
        super(msg);
    }
}
