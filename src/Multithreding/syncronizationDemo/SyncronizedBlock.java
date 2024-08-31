package Multithreding.syncronizationDemo;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

class BookTheaterSeats{
    Scanner sc=new Scanner(System.in);
    int total_seats;
    public BookTheaterSeats() {
        System.out.println("Enter total seats");
        total_seats = sc.nextInt(); // instance variable
    }
    synchronized void bookSeat(int seats){//synchronized method
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        synchronized (this) {//synchronized block
            if (total_seats>=seats){
                System.out.println(seats+" seats are booked successfully");
                total_seats=total_seats-seats;
                System.out.println(total_seats+" seats are left");
            }
            else {
                System.out.println("Seats not available");
                System.out.println("seats left "+total_seats);
            }
        }
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
        System.out.println("hi "+Thread.currentThread().getName());
    }
}
public class SyncronizedBlock extends Thread {
    static BookTheaterSeats b;
    int seats;
    public void run() {
        b.bookSeat(seats);
    }
    public static void main(String[] args) {
        b = new BookTheaterSeats();
        SyncronizedBlock m = new SyncronizedBlock();
        m.seats = 5;
        m.start();
        SyncronizedBlock m1 = new SyncronizedBlock();
        m1.seats = 3;
        m1.start();

    }
}
