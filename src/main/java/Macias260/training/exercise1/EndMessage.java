package Macias260.training.exercise1;

public class EndMessage implements Runnable {
    public EndMessage() {
    }

    @Override
    public void run() {
        try {

            Thread.sleep(60001 * 3);
            System.out.println("Program nie wykrył żadnych zależności - koniec pracy");
        } catch (InterruptedException e) {


        }
    }
}
