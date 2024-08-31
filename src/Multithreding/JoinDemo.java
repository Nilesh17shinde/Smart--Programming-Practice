package Multithreding;

public class JoinDemo extends Thread{
     public void run(){
         try {
             for (int i = 1; i <= 5; i++) {
                 System.out.println("Child thread" + i);
                 Thread.sleep(2000);
             }
         }catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
    public static void main(String[] args) throws InterruptedException {
        JoinDemo obj=new JoinDemo();
        obj.start();
        obj.join();
        try{
        for (int i = 1; i <= 5; i++) {
            System.out.println("main thread" + i);
            Thread.sleep(1000);
        }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
