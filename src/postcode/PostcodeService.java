package postcode;

public class PostcodeService {

    public static String city(String postcode) throws PostCodeServiceException {

        boolean outsideOpeningHours = false; // TODO

        if(outsideOpeningHours) {
            throw new PostCodeServiceUnavailableException();
        }


        switch(postcode) {
            case "7015": return "Trondheim";
            case "0001": return "Oslo";

            default: throw new PostCodeServiceFailedException();
        }

    }

}
