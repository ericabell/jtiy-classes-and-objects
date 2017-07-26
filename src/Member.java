import java.time.LocalDate;

public class Member {
    String name;
    Address address;
    java.time.LocalDate dob;

    public Member() {
    }

    public Member(String name, String addressLine1, String addressLine2, String city, String stateAbbr, String zip, String dob) {
        this.name = name;
        this.address = new Address(addressLine1, addressLine2, city, stateAbbr, zip);
        this.dob = LocalDate.parse(dob);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", dob=" + dob +
                '}';
    }
}
