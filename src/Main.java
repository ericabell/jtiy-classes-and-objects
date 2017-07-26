public class Main {

    public static void main(String[] args) {
	// write your code here

        // Creating objects from class definition
        Member member1 = new Member();
        member1.name = "John Doe";
        System.out.println(member1);

        // Using an overloaded constructor
        Member member2 = new Member("Jane Doe", "123 High St", null, "Austin", "TX", "78701", "1999-04-22");
        System.out.println(member2);

        // Using getter and setter methods to change the object
        System.out.println("before changing name " + member1.getName());
        member1.setName("Eric Abell");
        System.out.println("after changing name " + member1.getName());
    }
}
