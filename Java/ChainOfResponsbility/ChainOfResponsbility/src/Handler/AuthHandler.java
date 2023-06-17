package Handler;

import Request.Request;

public class AuthHandler extends DefaultRequestHandler{
    public AuthHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는가?");
        super.handle(request);
    }
}
