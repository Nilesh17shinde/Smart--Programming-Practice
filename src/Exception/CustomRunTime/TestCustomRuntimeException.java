package Exception.CustomRunTime;

public class TestCustomRuntimeException {
    public static void testCustomRuntimeException() {
        throw new CustomRuntimeException("This is custom runtime exception");
    }
    public static void main(String args[]){
        try{
            testCustomRuntimeException();
        }catch (Exception e){
            System.out.println("Something Wrong: "+e.getMessage());
        }
    }
}
/*
* RuntimeExceptionDemo contains the main method, which is the entry point of the program.
In the main method, doSomethingRisky() is called inside a try block.
doSomethingRisky() method throws a new MyRuntimeException with the message "Something went wrong!".
If the exception is thrown, it is caught by the catch block,
* and the message is printed: "Caught a runtime exception: Something went wrong!".
* */