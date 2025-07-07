import com.codingame.gameengine.runner.MultiplayerGameRunner;

public class JavaCupMain {
    public static void main(String[] args) {
        /* Multiplayer Game */
        MultiplayerGameRunner gameRunner = new MultiplayerGameRunner();

        // Adds as many player as you need to test your game
        gameRunner.addAgent(Agent1.class);
        gameRunner.addAgent(Agent2.class);      

        gameRunner.start();
    }
}
