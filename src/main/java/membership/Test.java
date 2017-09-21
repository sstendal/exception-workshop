package membership;

public class Test {

    public static void main(String[] args) {

        while (true) {

            String name = Console.read("Name:");

            try {

                String number = MembershipService.membershipNo(name);

                Console.write("Membership: " + number);

            } catch (MembershipServiceFailedException e) {
                Console.write("Not a member");
            }

        }


    }


}
