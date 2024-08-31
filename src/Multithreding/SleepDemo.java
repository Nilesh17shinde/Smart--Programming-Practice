package Multithreding;

public class SleepDemo extends Thread {
    public void run(){
        for (int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepDemo obj=new SleepDemo();
        obj.start();
    }
}
