package com.startStopGame.models;

public class Oscillator {

    private int currPosition, lowerBound, upperBound;
    private boolean startIndicator;
    private boolean forwardFlag;
    private Thread currentThread;

    private Oscillator(){}

    private static class OscillatorHelper {
        private static Oscillator instance = new Oscillator();
    }

    public static Oscillator getOscillatorInstance(){
        return OscillatorHelper.instance;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    public boolean isStartIndicator() {
        return startIndicator;
    }

    public void setStartIndicator(boolean startIndicator) {
        this.startIndicator = startIndicator;
    }

    public int getLowerBound(){
        return this.lowerBound;
    }

    public int getUpperBound(){
        return this.upperBound;
    }

    public boolean isForwardFlag() {
        return forwardFlag;
    }

    public void setForwardFlag(boolean forwardFlag) {
        this.forwardFlag = forwardFlag;
    }

    public Thread getCurrentThread() {
        return currentThread;
    }

    public void setCurrentThread(Thread currentThread) {
        this.currentThread = currentThread;
    }

    public int getCurrPosition(){
        return this.currPosition;
    }

    public void setCurrPosition(int currPosition){
        this.currPosition = currPosition;
    }

}
