public class Member {
    String name;
    Address address;
    java.time.LocalDate dob;

    public Member() {
        System.out.println("in generic constructor");
    }

    public Member(String name, String addressLine1, String addressLine2, String city, String state, String zip, String dob) {
        System.out.println("in constructor");
        this.name = name;
        this.address = new Address(addressLine1, addressLine2, city, state, zip);
        this.dob = java.time.LocalDate.parse(dob);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "name=" + name + address + ", ..., dob=" + dob;
    }

}
