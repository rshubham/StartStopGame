package com.startStopGame.commands;

import com.startStopGame.receiver.Oscillator;

public class StartGameCommand implements GameCommand {

    public StartGameCommand(int lowerBound, int upperBound){
        Oscillator.getOscillatorInstance().setOscillatorRange(lowerBound,upperBound);
    }

    @Override
    public void executeCommand() throws InterruptedException {
        Oscillator.getOscillatorInstance().startOscillator();
    }
}
