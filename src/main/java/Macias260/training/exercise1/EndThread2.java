package Macias260.training.exercise1;

public class EndThread2 implements Runnable {
    private Temperature temperature;
    private Thread thread = new Thread(temperature);

    public EndThread2() {

    }

    @Override
    public void run() {
        try {
            Thread.sleep(60000 * 2);
            thread.interrupt();
//            Sprawdzenie czy wątek zakończył działanie
            System.out.println("Wątek 2 zakończył działanie: " + thread.isInterrupted());
        } catch (InterruptedException e) {

        }


    }
}
