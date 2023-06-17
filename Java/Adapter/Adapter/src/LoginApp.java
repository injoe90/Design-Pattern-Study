import AccountService.*;
import UserService.LoginHandler;
import UserService.UserDetailService;

public class LoginApp {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailService userDetailService = new AccountUserDetailService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailService);

        String login = loginHandler.login("injoe90", "injoe90");
        System.out.println(login);
    }
}
