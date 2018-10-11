package Macias260.training.exercise1;

public class EndThread1 implements Runnable {
    private ActualTime actualTime;
    private Thread thread = new Thread(actualTime);

    public EndThread1() {
    }

    @Override
    public void run() {

        try {

            Thread.sleep(60000 * 3);
            thread.interrupt();
            //            Sprawdzenie czy wątek zakończył działanie

            System.out.println("Wątek 1 zakończył działanie: " + thread.isInterrupted());
        } catch (InterruptedException e) {


        }

    }
}
