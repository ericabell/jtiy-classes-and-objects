public class Main {

    public static void main(String[] args) {

        // CREATE OBJECTS FOR MEMBER AND BRANCH
        Member member1 = new Member("John Doe", "123 Main Str", "Apt 234", "Austin", "TX", "78709", "1999-02-23");
        Branch branch1 = new Branch("321 Main Str", "Apt 4567", "Austin", "TX", "78709", "9am-5pm");

        // PRINT THEM USES toString
        System.out.println(member1);
        System.out.println(branch1);

        // USE GETTER/SETTER
        System.out.println( "member1's address is " + member1.getAddress() );
        Address newAddress = new Address("123 Main Street", "Apt 543", "Austin", "TX", "78709");
        member1.setAddress(newAddress);
        System.out.println( "member1's city after setter is " + member1.getAddress() );


    }
}
