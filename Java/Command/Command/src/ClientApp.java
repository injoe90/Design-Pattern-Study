import Command.GameEndCommand;
import Command.GameStartCommand;
import Game.Game;
import Invoker.Button;

public class ClientApp {
    public static void main(String[] args) {
        Button startGameButton = new Button(new GameStartCommand(new Game()));
        Button endGameButton = new Button(new GameEndCommand(new Game()));

        startGameButton.press();
        startGameButton.undo();
        endGameButton.press();
        endGameButton.undo();
    }
}
