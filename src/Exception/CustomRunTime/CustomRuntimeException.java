package Exception.CustomRunTime;

public class CustomRuntimeException extends RuntimeException{
    CustomRuntimeException(String message){
        super(message);
    }
}
/*
* MyRuntimeException extends RuntimeException, meaning it is an unchecked exception.
It has a constructor that takes a String message and passes it to the superclass (RuntimeException)
* constructor. This message can be used to describe what went wrong.
* */