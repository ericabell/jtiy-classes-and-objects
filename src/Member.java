import java.time.LocalDate;

public class Member {
    String name;
    Address address;
    // Adventure: Member can have multiple addresses

    // GP: multiple addresses should be List<Address>
    Address addressBackup;
    Address addressBackup2;
    java.time.LocalDate dob;

    public Member() {
    }

    public Member(String name, Address address, String dob) {
        this.name = name;
        this.address = address;
        this.dob = LocalDate.parse(dob);
    }

    public Member(String name, Address address, Address addressBackup, String dob) {
        this.name = name;
        this.address = address;
        this.addressBackup = addressBackup;
        this.dob = LocalDate.parse(dob);
    }

    public Member(String name, Address address, Address addressBackup, Address addressBackup2, String dob) {
        this.name = name;
        this.address = address;
        this.addressBackup = addressBackup;
        this.addressBackup2 = addressBackup2;
        this.dob = LocalDate.parse(dob);
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
        // a member can have 1, 2, or 3 addresses
        // just print null if those other addresses haven't been assigned
        return "Member{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", addressBackup=" + addressBackup +
                ", addressBackup2=" + addressBackup2 +
                ", dob=" + dob +
                '}';
    }
}
