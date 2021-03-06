package com.startStopGame.commands;

import com.startStopGame.util.OscillatorUtil;

public class StartGameCommand implements GameCommand {

    OscillatorUtil oscillatorUtil = OscillatorUtil.getOscillatorInstance();


    public StartGameCommand(int lowerBound, int upperBound){
        oscillatorUtil.setOscillatorRange(lowerBound,upperBound);
    }

    @Override
    public void executeCommand() throws InterruptedException {
        oscillatorUtil.startOscillator();
    }
}
