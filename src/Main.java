public class Main {

    public static void main(String[] args) {
	// write your code here

        // Creating objects from class definition
        Member member1 = new Member();
        member1.name = "John Doe";
        System.out.println(member1);

        // Using an overloaded constructor
        Member member2 = new Member("Jane Doe", "123 High St", null, "Austin", "TX", "78701", "1999-04-22");
        // Uses the toString method to print object
        System.out.println(member2);

        // Using getter and setter methods to change the object
        System.out.println("before changing name " + member1.getName());
        member1.setName("Eric Abell");
        System.out.println("after changing name " + member1.getName());

        // BRANCHES
        Branch branch1 = new Branch("123 Main Street", "Apt 234", "Austin", "TX", "78709", "9am-5pm");
        System.out.println(branch1);

        // Using getter and setter methods to change the object
        System.out.println("before changing addressLine1 " + branch1.getAddressLine1());
        branch1.setAddressLine1("456 Seattle Street");
        System.out.println("after changing addressLine1 " + branch1.getAddressLine1());

        // EPIC -- parse raw address string input
        System.out.println("EPIC MODE TEST");
        Branch branch2 = new Branch("123 Main St, Apt 543, Austin, TX, 78709, 9am-4pm");
        System.out.println(branch2);
    }
}
