package login;

public class LoginService {

    public static void login(String username, String password) throws LoginFailedException {
        if(!username.equals(password)) {
            throw new LoginFailedException();
        }
    }

}
