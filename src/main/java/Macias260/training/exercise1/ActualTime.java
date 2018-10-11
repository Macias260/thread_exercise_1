package Macias260.training.exercise1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ActualTime implements Runnable {

    private String timeFormat = "HH:mm:ss";
    private DateTimeFormatter format = DateTimeFormatter.ofPattern(timeFormat);
    private LocalDateTime now;
    private int time;

    public ActualTime(int time) {
        this.time = (time * 2);
    }

    @Override
    synchronized public void run() {
        for (int i = 0; i < time; i++) {
            now = LocalDateTime.now();
            System.out.println("Aktualny czas: " + format.format(now));
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {

            }
        }
        notifyAll();
    }
}
