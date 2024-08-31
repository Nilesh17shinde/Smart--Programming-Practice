package FeaturesOfJava8.Lambda;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable runnable=()->{
            for (int i=1;i<=10;i++){
                System.out.println(i);
            }
        };
        Thread thread=new Thread(runnable);
        thread.run();
    }
}
