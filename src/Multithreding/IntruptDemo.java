package Multithreding;

public class IntruptDemo extends Thread{
    public void run(){
        System.out.println(Thread.interrupted());//for checking thread is interrupted or not
//        System.out.println(Thread.currentThread().isInterrupted());//for checking thread is interrupted or not
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(2000);
            }
        }catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        IntruptDemo obj=new IntruptDemo();
        obj.start();
        obj.interrupt();
    }
}
