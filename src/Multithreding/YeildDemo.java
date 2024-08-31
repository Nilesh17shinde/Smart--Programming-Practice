package Multithreding;

public class YeildDemo extends  Thread{
    public void run(){
        for (int i = 1; i <=10; i++) {
            System.out.println(Thread.currentThread().getName()+":-"+i);
        }
    }

    public static void main(String[] args) {
        YeildDemo obj=new YeildDemo();
        obj.start();
        Thread.yield();
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Main Thread: "+i);

        }
    }
}
