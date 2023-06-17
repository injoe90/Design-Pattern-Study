import Handler.AuthHandler;
import Handler.LoggingRequestHandler;
import Handler.PrintRequestHandler;
import Handler.RequestHandler;

public class Main {
    public static void main(String[] args) {
        RequestHandler chain = new AuthHandler(
                                new LoggingRequestHandler(
                                        new PrintRequestHandler(null)
                                ));

        Client client = new Client(chain);
        client.doWork();
    }
}