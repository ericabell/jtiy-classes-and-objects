public class Main {

    public static void main(String[] args) {

        // ASSIGNMENT:
        //   In the lecture both Member and Branches has an Address.
        //   Make Address its own class and have Member use it.


        // CREATE OBJECTS FOR MEMBER AND BRANCH
        Member member1 = new Member("John Doe", "123 Main Str", "Apt 234", "Austin", "TX", "78709", "1999-02-23");
        Branch branch1 = new Branch("321 Main Str", "Apt 4567", "Austin", "TX", "78709", "9am-5pm");

        // PRINT THEM USES toString
        System.out.println(member1);
        System.out.println(branch1);

        // USE GETTER/SETTER, requires creation of an Address object to pass to the setAddress method of the Member class
        System.out.println( "member1's address is " + member1.getAddress() );
        Address newAddress = new Address("123 Main Street", "Apt 543", "Austin", "TX", "78709");
        member1.setAddress(newAddress);
        System.out.println( "member1's city after setter is " + member1.getAddress() );

        // Adventure challenge: Member can have up to three addresses
        Member member2 = new Member("Mike Doe", newAddress, newAddress, newAddress, "2001-10-10");
        System.out.println(member2);

    }
}
