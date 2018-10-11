package Macias260.training.exercise1;

import java.util.Random;

public class Temperature implements Runnable {

    private Random random = new Random();
    private Double time;

    public Temperature(Integer time) {
        this.time = (time * 1.3333);
    }

    @Override
    public void run() {
        for (int i = 0; i < time; i++){
            System.out.println("Aktualna temperatura ( ͡° ͜ʖ ͡°) -> " + random.nextInt(100) +
                    " C");
            try {
                Thread.sleep(45000);
            } catch (InterruptedException e) {

            }
        }


    }
}
