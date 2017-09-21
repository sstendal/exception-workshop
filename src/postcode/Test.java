package postcode;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        while (true) {

            String namesInput = Console.read("Name(s):");

            String[] names = namesInput.split(",");

            Arrays.stream(names).forEach(postcode -> {
                try {

                    String city = PostcodeService.city(postcode);

                    Console.write("City: " + city);

                } catch (PostCodeServiceFailedException e) {

                    Console.write("Unknown postcode: " + postcode);

                } catch (PostCodeServiceException e) {

                    Console.write("Service unavailable");

                }
            });


        }

    }

}
