package com.startStopGame.invoker;

import com.startStopGame.commands.GameCommand;

public class GameExecutor implements IGameExecutor{

    GameCommand command;

    public GameExecutor(GameCommand command){
        this.command = command;
    }

    @Override
    public void execute() throws InterruptedException {
        this.command.executeCommand();
    }
}
