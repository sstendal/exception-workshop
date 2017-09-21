package login;

public class Test {

    public static void main(String[] args) {

        boolean loggedIn = false;

        while (!loggedIn) {

            String username = Console.read("Username:");
            String password = Console.read("Password:");

            try {

                LoginService.login(username, password);

                loggedIn = true;

            } catch (LoginFailedException e) {

                Console.write("Unknown username or wrong password :(");
            }
        }

        Console.write("Logged in :)");

    }


}
