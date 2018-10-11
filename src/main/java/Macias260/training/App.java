package Macias260.training;


import Macias260.training.exercise1.*;

public class App {
    public static void main(String[] args) {
        ActualTime actualTime = new ActualTime(3);
        Temperature temperature = new Temperature(2);
        EndThread1 endThread1 = new EndThread1();
        EndThread2 endThread2 = new EndThread2();
        EndMessage endMessage = new EndMessage();

        Thread thread1 = new Thread(actualTime);
        Thread thread2 = new Thread(temperature);
        Thread thread3 = new Thread(endThread1);
        Thread thread4 = new Thread(endThread2);
        Thread thread5 = new Thread(endMessage);


        System.out.println("Program badający zależność między upływem czasu a zmianą temperatury");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }


}

