package FeaturesOfJava8.Lambda.Thread;

public class MainThread {

    public static void main(String[] args) {
        Runnable thread=()->{
            for (int i = 1; i <=10 ; i++) {
                System.out.println(i*2);
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread t=new Thread(thread);
        t.start();
    }
}
