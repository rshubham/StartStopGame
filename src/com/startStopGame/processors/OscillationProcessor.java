package com.startStopGame.processors;

import com.startStopGame.util.OscillatorUtil;

public class OscillationProcessor implements Runnable {

    private OscillationProcessor(){}

    private static class OscillationProcessorHelper {
        private static OscillationProcessor instance = new OscillationProcessor();
    }

    public static OscillationProcessor getOscillationProcessorInstance(){
        return OscillationProcessor.OscillationProcessorHelper.instance;
    }


    @Override
    public void run() {
        try {
            OscillatorUtil.getOscillatorInstance().runOscillator();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
