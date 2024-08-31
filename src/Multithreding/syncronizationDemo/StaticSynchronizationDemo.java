package Multithreding.syncronizationDemo;

import java.util.Scanner;

class BookTheater {
//    Scanner sc = new Scanner(System.in);
    static int totalSeats=15;

//    public BookTheater() {
//        System.out.println("Enter total seats");
//        totalSeats = sc.nextInt(); // instance variable
//    }

    static synchronized void bookSeat(int seats) {
        if (totalSeats >= seats) {
            System.out.println(seats + " seats are booked successfully");
            totalSeats -= seats;
            System.out.println(totalSeats + " seats are left");
        } else {
            System.out.println("Seats not available");
            System.out.println("Seats left: " + totalSeats);
        }
    }
}

class MyThread1 extends Thread {
    BookTheater b;
    int seats;

    MyThread1(BookTheater b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.bookSeat(seats);
    }
}

class MyThread2 extends Thread {
    BookTheater b;
    int seats;

    MyThread2(BookTheater b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.bookSeat(seats);
    }
}

public class StaticSynchronizationDemo {
    public static void main(String[] args) {
        BookTheater b = new BookTheater();
        MyThread1 m = new MyThread1(b, 5);
        m.start();
        MyThread2 m1 = new MyThread2(b, 13);
        m1.start();

        BookTheater b1 = new BookTheater();
        MyThread1 m2 = new MyThread1(b1, 8);
        m2.start();
        MyThread2 m3 = new MyThread2(b1, 9);
        m3.start();
    }
}
