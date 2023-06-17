package Handler;

import Request.Request;

public class DefaultRequestHandler implements RequestHandler{
    private RequestHandler nextHandler;

    public DefaultRequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
