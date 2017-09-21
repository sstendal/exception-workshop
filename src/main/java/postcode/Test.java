package postcode;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        while (true) {

            String PostcodesInput = Console.read("Postcodes(s):");

            String[] postcodes = PostcodesInput.split(",");

            Arrays.stream(postcodes).forEach(postcode -> {
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
