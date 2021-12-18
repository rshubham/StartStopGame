package com.startStopGame.commands;

import com.startStopGame.receiver.Oscillator;

public class StopGameCommand implements GameCommand {

    @Override
    public void executeCommand() throws InterruptedException {
        Oscillator.getOscillatorInstance().stopOscillator();
    }
}
