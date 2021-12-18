package com.startStopGame.util;

import com.startStopGame.models.Oscillator;
import com.startStopGame.processors.OscillationProcessor;

public class OscillatorUtil {


    private OscillatorUtil(){}

    private static class OscillatorUtilHelper {
        private static OscillatorUtil instance = new OscillatorUtil();
    }

    public static OscillatorUtil getOscillatorInstance(){
        return OscillatorUtilHelper.instance;
    }

    Oscillator oscillator = Oscillator.getOscillatorInstance();

    public void runOscillator() throws InterruptedException {

        while(oscillator.isStartIndicator()){
            Thread.sleep(10);
            if(oscillator.getCurrPosition() == oscillator.getLowerBound()) oscillator.setForwardFlag(true);
            if(oscillator.getCurrPosition() == oscillator.getUpperBound()) oscillator.setForwardFlag(false);
            if(oscillator.isForwardFlag()) oscillator.setCurrPosition(oscillator.getCurrPosition()+1);
            else oscillator.setCurrPosition(oscillator.getCurrPosition()-1);
        }
    }

    public void setOscillatorRange(int lowerBound, int upperBound){
        oscillator.setLowerBound(lowerBound);
        oscillator.setUpperBound(upperBound);
        oscillator.setCurrPosition(lowerBound);
    }


    public void startOscillator() {

        oscillator.setStartIndicator(true);
        oscillator.setCurrentThread(new Thread(OscillationProcessor.getOscillationProcessorInstance()));
        oscillator.getCurrentThread().start();
    }

    public void stopOscillator(){
        oscillator.setStartIndicator(false);
        System.out.println("CurrPosition : "+ oscillator.getCurrPosition());
    }


}
