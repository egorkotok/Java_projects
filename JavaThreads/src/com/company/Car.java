package com.company;

import java.util.concurrent.TimeUnit;

public class Car extends Thread {

    private int waitingtime;
    private boolean done = false;

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getWaitingtime() {
        return waitingtime;
    }

    public void setWaitingtime(int waitingtime) {
        this.waitingtime = waitingtime;
    }

    public Car(int waitingtime) {
        this.waitingtime = waitingtime;
    }

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(waitingtime);
            done = true;
            System.out.println(getWaitingtime() + " Done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
