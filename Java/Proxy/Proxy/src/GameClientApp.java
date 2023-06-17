import GameService.*;

public class GameClientApp {
    public static void main(String[] args) {
         /*GameService gameService = new GameServiceProxy();
         gameService.startGame();*/

        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }
}
