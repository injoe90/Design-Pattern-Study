package UserService;

public class LoginHandler {
    UserDetailService userDetailService;

    public LoginHandler(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUserName();
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
