package Exception.CustomCompileTime;

public class CustomRuntimeException extends Exception{
    CustomRuntimeException(String message){
        super(message);
    }
}
/*
* MyCheckedException extends Exception, meaning it is a checked exception.
It has a constructor that takes a String message and passes it to the superclass (Exception) constructor.
* This message can be used to describe what went wrong.
* */