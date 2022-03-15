package thread.ex1;

import java.time.Instant;

public class Employee extends Thread {
    public static long WORKINGINTERVAL = 10000;
    private String name;
    private Instant time;
    private boolean isStillWorking = true;

    public Employee(String name) {
        this.name = name;
        this.time = Instant.now();
    }

    @Override
    public void run() {
        try {
            Instant time = this.time;
            System.out.println(name + ":I came to work at" + time);

            while (isStillWorking) {
                Thread.sleep(10000);
                System.out.println(name + ": I'm still working.");
            }

            System.out.println(name + ": It's time to go home");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setTime (Instant time){
        this.time = time;
    }


    public void setStillWorking(boolean b) {
    }
}