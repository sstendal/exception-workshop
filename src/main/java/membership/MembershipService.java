package membership;

public class MembershipService {

    public static String membershipNo(String name) throws MembershipServiceFailedException {

        switch(name) {
            case "Ola": return "001";
            case "Trine": return "002";

            default: throw new MembershipServiceFailedException();
        }

    }

}
