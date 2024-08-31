package Multithreding;

class Medical extends Thread{
    public void run(){

        try {
            System.out.println("Medical starts");
            Thread.sleep(2000);
            System.out.println("Medical Completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Driver extends Thread{
    public void run(){
        try {
            System.out.println("Driver starts");
            Thread.sleep(2000);
            System.out.println("Driver Completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
class Officer extends Thread{
    public void run(){
        try {
            System.out.println("Officer starts");
            Thread.sleep(2000);
            System.out.println("Officer Completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
public class JoinDemo1 {
    public static void main(String[] args) throws InterruptedException {
        Medical m=new Medical();
        m.start();
        m.join(3000);
        Driver d=new Driver();
        d.start();
        d.join();
        Officer o=new Officer();
        o.start();

    }
}
