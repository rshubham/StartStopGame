package com.startStopGame.commands;

import com.startStopGame.util.OscillatorUtil;

public class StopGameCommand implements GameCommand {

    OscillatorUtil oscillatorUtil = OscillatorUtil.getOscillatorInstance();

    @Override
    public void executeCommand() throws InterruptedException {
        oscillatorUtil.stopOscillator();
    }
}
