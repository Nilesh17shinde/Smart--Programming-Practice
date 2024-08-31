package Multithreding.syncronizationDemo;

import java.util.Scanner;

class BookTheaterSeat{
    Scanner sc=new Scanner(System.in);
    int total_seats;//instance variable
    public BookTheaterSeat() {
        System.out.println("Enter total seats");
        total_seats = sc.nextInt(); // instance variable
    }
    synchronized void bookSeat(int seats){//synchronized method
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
}
public class MovieBookApp extends Thread {
    static BookTheaterSeat b;
    int seats;

    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();
        MovieBookApp m = new MovieBookApp();
        m.seats = 5;  
        m.start();
        MovieBookApp m1 = new MovieBookApp();
        m1.seats = 3;
        m1.start();
    }
}
