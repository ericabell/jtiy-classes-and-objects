public class Member {
    String name;
    String addressLine1;
    String addressLine2;
    String city;
    String stateAbbr;
    String zip;
    java.time.LocalDate dob;

    public Member() {
        System.out.println("in generic constructor");
    }

    public Member(String name, String addressLine1, String addressLine2, String city, String state, String zip, String dob) {
        System.out.println("in constructor");
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.stateAbbr = state;
        this.zip = zip;
        this.dob = java.time.LocalDate.parse(dob);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "name=" + name + ", addressLine1" + addressLine1 + ", ..., dob=" + dob;
    }

}
