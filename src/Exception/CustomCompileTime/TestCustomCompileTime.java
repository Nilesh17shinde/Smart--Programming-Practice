package Exception.CustomCompileTime;

public class TestCustomCompileTime {
    public static void testCompileTimeException() throws CustomRuntimeException{
        throw new CustomRuntimeException("This is custom compile time exception");
    }
    public static void main(String args[]){
        try{
            testCompileTimeException();
        }catch (Exception e){
            System.out.println("Something Wrong: "+e.getMessage());
        }
    }
}
/*
CheckedExceptionDemo contains the main method, which is the entry point of the program.
In the main method, doSomethingRisky() is called inside a try block.
doSomethingRisky() method declares that it throws MyCheckedException.
This means that any method that calls doSomethingRisky()
must either handle this exception with a try-catch block or declare that it throws this exception.
doSomethingRisky() method throws a new MyCheckedException with the message "Something went wrong!".
If the exception is thrown, it is caught by the catch block, and the message is printed:
"Caught a checked exception: Something went wrong!".
* */