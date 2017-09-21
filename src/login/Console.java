package login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

    private static BufferedReader systemIn = new BufferedReader(new InputStreamReader(System.in));


    public static String read(final String prompt) {
        try {
            System.out.print(prompt + " ");
            return systemIn.readLine().trim();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void write(String text) {
        System.out.println(text);
    }



}
