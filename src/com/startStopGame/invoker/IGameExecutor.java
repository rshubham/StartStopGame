package com.startStopGame.invoker;

import com.startStopGame.commands.GameCommand;

public interface IGameExecutor {
    public void execute() throws InterruptedException;
}
