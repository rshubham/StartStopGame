package com.startStopGame.receiver;

public class Oscillator implements Runnable {

    private int currPosition, lowerBound, upperBound;
    private boolean startIndicator;
    private boolean forwardFlag;
    Thread currentThread;

    private Oscillator(){}

    @Override
    public void run() {
        try {
            runOscillator();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class OscillatorHelper {
        private static Oscillator instance = new Oscillator();
    }

    public static Oscillator getOscillatorInstance(){
        return OscillatorHelper.instance;
    }

    // setting range for Oscillator
    public void setOscillatorRange(int lowerBound, int upperBound){
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.currPosition = lowerBound;
    }

    public void runOscillator() throws InterruptedException {
        while(this.startIndicator && !this.currentThread.isInterrupted()){
            Thread.sleep(10);
            if(this.currPosition == 1) this.forwardFlag = true;
            if(this.currPosition == this.upperBound) this.forwardFlag = false;
            if(this.forwardFlag) this.currPosition++;
            else this.currPosition--;
        }
    }


    public void startOscillator() throws InterruptedException {
        this.startIndicator = true;
        this.currentThread = new Thread(this);
        this.currentThread.start();
    }

    public void stopOscillator(){
        this.startIndicator = false;
        System.out.println("CurrPosition : "+ this.currPosition);
    }

    public int getCurrPosition(){
        return this.currPosition;
    }

}
