public class Branch {
    Address address;
    String hours;

    public Branch() {
    }

    public Branch(Address address, String hours) {
        this.address = address;
        this.hours = hours;
    }

    public Branch(String addressLine1, String addressLine2, String city, String stateAbbr, String zip, String hours) {
        this.address = new Address(addressLine1, addressLine2, city, stateAbbr, zip);
        this.hours = hours;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "address=" + address +
                ", hours='" + hours + '\'' +
                '}';
    }
}
