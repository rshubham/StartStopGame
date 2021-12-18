package com.startStopGame;

import com.startStopGame.commands.GameCommand;
import com.startStopGame.commands.StartGameCommand;
import com.startStopGame.commands.StopGameCommand;
import com.startStopGame.invokers.GameExecutor;
import com.startStopGame.invokers.IGameExecutor;
import com.startStopGame.models.Oscillator;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Start Stop Game!!");
        System.out.println("There is Pointer which will move in a certain range as provided by You");
        System.out.println("Enter the Range for the Start Stop Game : ");
        int lowerBound = sc.nextInt();
        int upperBound = sc.nextInt();
        int startcommand;
        int command;
        GameCommand startGame = new StartGameCommand(lowerBound, upperBound);
        IGameExecutor executor;
        do{
            System.out.println("Press 1 to Start the Game or 4 to end the Game: ");
            startcommand = sc.nextInt();
            if(startcommand == 1) {
                System.out.println("Game is Running..");
                executor = new GameExecutor(startGame);
                executor.execute();
                do {
                    System.out.println("Press 2 to get Current Position and Press 3 to Stop : ");
                    command = sc.nextInt();
                    switch (command){
                        case 1 : {
                            System.out.println("Game is Running..");
                            break;
                        }
                        case 2 : {
                            System.out.println("Current Position is : " + Oscillator.getOscillatorInstance().getCurrPosition());
                            break;
                        }
                        case 3 : {
                            System.out.println("Stopping the Game and Printing the current Position..");
                            executor = new GameExecutor(new StopGameCommand());
                            executor.execute();
                            break;
                        }
                    }
                } while(command < 3);
            }
        } while(startcommand == 1);
        System.out.println("Game Over!");
    }
}