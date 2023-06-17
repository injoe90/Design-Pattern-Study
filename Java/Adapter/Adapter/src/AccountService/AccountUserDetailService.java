package AccountService;

import UserService.*;

public class AccountUserDetailService extends UserDetailService {
    AccountService accountService;

    public AccountUserDetailService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUserName(username);
        return new AccountUserDetails(account);
    }
}
