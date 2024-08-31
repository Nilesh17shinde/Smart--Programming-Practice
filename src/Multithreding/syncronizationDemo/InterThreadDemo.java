package Multithreding.syncronizationDemo;
class TotalEarning extends Thread{
    int total=0;
    public void run(){
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + i;
            }
            //this.notifyAll();//notify the waiting thread
            this.notify();//notify the waiting threadf
        }
    }
}
public class InterThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        TotalEarning t=new TotalEarning();
        t.start();
        synchronized (t)
        {
            t.wait();
            System.out.println("Total Earning: "+t.total+" rs");
        }

    }
}
