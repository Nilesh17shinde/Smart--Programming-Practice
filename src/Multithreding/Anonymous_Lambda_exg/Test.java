package Multithreding.Anonymous_Lambda_exg;

public class Test {
    public static void main(String[] args) {
//        Anonymous Class
        System.out.println("----------------------------Annonymous Class-------------------------------------");
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<=5;i++){
                    try {
                        Thread.sleep(2000);
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    System.out.println("This is thread: "+Thread.currentThread().getName());
                }
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();

        System.out.println("-----------------------------------Lambda----------------------------------------");
//    Lambda
        Runnable runnable1 = ()->{
            System.out.println("Thread: "+ Thread.currentThread().getName());
        };

        Thread thread1=new Thread(runnable1);
        thread1.start();
    }
}
