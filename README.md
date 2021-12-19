### Start Stop Game

<hr>

**Introduction**

 This Project is created to learn about the real-life implementation of Command Design Pattern by implementing it on a Start-Stop Game Application using Multithreading.
 
 <hr>
 
 **Structure**

+ GameCommand - Interface, implemented by StartGameCommand and StopGameCommand.
+ Oscillator - Class, acts as a receiver of the Command. This class implements Runnable interface, which helps Oscillator to run in a separate thread.
+ IGameExecutor - Interface, implemented by GameExecutor class, which will execute the commands as per the input provided by the Client.
+ Client - This will run the main thread, where the Game will run and interact with the player.

**Game Design**

 ![alt text](https://github.com/rshubham/StartStopGame/blob/master/UML_Design.jpeg)
